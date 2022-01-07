# Wymagania

1. linux (przetestowane na czystym ubuntu 18.04)
2. `curl` oraz `git` do zainstalowania menadżerem paczek na systemie
3. `docker` https://docs.docker.com/get-docker/
4. `java` do zainstalowania np: https://sdkman.io/install

# Uruchomienie

```bash
# poniższe zadanie uruchomi obraz dockera z serwerem http
# oraz uruchomi testy
./gradlew runAllTestsWithDependencies
```

Serwer http znajduje się w projekcie `http-server`.
Jest uruchamiany jako kontener i udostępnia dwie metody http.
Projekt `app` zawiera implementację algorytmu wyszukiwania powtórzeń w ciągu oraz dwa testy komunikacji z usługą `http-server`.

# Instrukcja zadania

Nie chcemy, żebyś spędzał/spędzała bardzo dużo czasu na tym zadaniu (przecież lepiej oglądać [wesołe kotki](https://www.youtube.com/watch?v=SB-qEYVdvXA)).
Rozwiązania są proste, ale nie łatwe ani oczywiste:

1. rozwiąż dwa zadania z [IntegrationFun.scala](app/src/test/scala/ravenetics/test/IntegrationFun.scala)
2. zaimplementuj testy w wybranym języku (java/scala) w odpowiednim pliku: [CycleDetectorTestJava.java](app/src/test/scala/ravenetics/test/CycleDetectorTestJava.java) lub [CycleDetectorTestScala.scala](app/src/test/scala/ravenetics/test/CycleDetectorTestScala.scala)
3. swoje zmiany wyślij nam mailem w formie patcha git na adres rekrutacja@ravenetics.com

Powodzenia! 😉
