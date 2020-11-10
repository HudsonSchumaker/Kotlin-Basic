package br.com.schumaker.kotlin.concurrency

fun activeActor(out: SendChannel<String>) = actor<Int> {
  for (i in this) {
     out.send(i.toString().reversed())
  }
  out.close()
}

val channel = Channel<String>()
val actor = activeActor(channel)

val j1 = launch {
  for (i in 42..53) {
    actor.send(i)
  }
  actor.close()
}

val j2 = launch {
  for (in inchannel {
    print(i)
  }
}

j1.join()
j2.join()
