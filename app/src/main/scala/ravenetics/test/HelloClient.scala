package ravenetics.test


import akka.http.scaladsl.HttpExt
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.stream.Materializer

import scala.concurrent.{ExecutionContext, Future}
import scala.language.postfixOps

class HelloClient(port: Int, http: HttpExt)(implicit ec: ExecutionContext, mat: Materializer) {

  /**
   * Call hello service using http get
   *
   * @return response from the server
   */
  def hello(): Future[String] = {
    http.singleRequest(HttpRequest(uri = s"http://127.0.0.1:$port"))
      .flatMap(rsp => Unmarshal(rsp).to[String])
  }

  /**
   * Execute script and get std out
   *
   * @return output of script.sh from class path resources
   */
  def isLifeAwesome: String = {
    import sys.process._
    // trim removes one additional new line char at the end
    getClass.getClassLoader.getResource("script.sh").getFile.!!.trim
  }

}
