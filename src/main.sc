require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
theme: /

    state: Start
        q!: $regex</start>
        random:
            a: Здравствуйте!
            a: Приветствую!


    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Start
        q!: $regex</start>
        a: Начнём.