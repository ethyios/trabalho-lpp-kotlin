open class Pessoa { //A palavra-chave "open" significa que essa classe pode ser herdada
    open var identidade = "indigente n tem identidade" //Esse método pode ser alterado pelas
                                                    //classes que herdam dessa.
    override fun toString() = "indigente" //Exemplo de alteração em função padrão do Kotlin
}

class Gus: Pessoa() { //Aqui a classe Gus herda de Pessoa
    override var identidade = "REDACTED" //Exemplo de alteração de variável que existe em Pessoa.
    override fun toString() = "perdeu a identidade, mas sabe"
}

class Filipe: Pessoa() {
    override var identidade = "REDACTED"
    override fun toString() = "tem identidade, nao eh indigente"
}

fun main() {
    var pessoa1 = Pessoa()
    var pessoa2 = Gus()
    var pessoa3 = Filipe()

    println("Status da primeira pessoa: $pessoa1\n\tIdentidade: " + pessoa1.identidade)
    println("Status da segunda pessoa: $pessoa2\n\tIdentidade: " + pessoa2.identidade)
    println("Status da terceira pessoa: $pessoa3\n\tIdentidade: " + pessoa3.identidade)
}