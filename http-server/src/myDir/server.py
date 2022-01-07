from http.server import HTTPServer, BaseHTTPRequestHandler

class S(BaseHTTPRequestHandler):
    def _set_headers(self):
        self.send_response(200)
        self.send_header("Content-type", "text/plain")
        self.end_headers()

    def do_GET(self):
        self._set_headers()
        self.wfile.write("hello world!".encode("utf8"))

    def do_POST(self):
        self._set_headers()
        self.wfile.write("bash\nis\ncomplicated".encode("utf8"))


def run(server_class=HTTPServer, handler_class=S):
    addr = ("0.0.0.0", 7777)
    httpd = server_class(addr, handler_class)
    print(f"Starting server")
    httpd.serve_forever()

if __name__ == "__main__":
    run()