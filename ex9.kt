fun main() {
    //Resposta da 9:
    var inteiro = 12 //Definição e atribuicão do tipo inteiro
    var flutuante = 12.5f //Definição e atribuicão do tipo float
    var cadeia = "O mundo por trás do mundo é um outro mundo." //Definição e atribuicão do tipo cadeia de caracteres
    var truefalse = true;  //Definição e atribuicão do tipo booleano

    println(inteiro) //Prints dos vários tipos
    println(flutuante)
    println(cadeia)
    println(truefalse)

    //Resposta da 10: Definição e atribuicão do array unidimensional de CADEIAS DE CARACTERES
    var otacadeia = arrayOf("O","mundo","a","frente","do","mundo","também","é","outro","mundo")
    var igreja = arrayOf( //Definição e atribuicão do array bidimensional de inteiros
        intArrayOf(1,2,3,4,5,6),
        intArrayOf(6,5,4,3,2,1)
    )

    println(otacadeia.joinToString(" ")) //impressões dos arrays.
    println(igreja.joinToString("\n") { row -> row.joinToString(",") })

    //Resposta da 11:
    /* Em Kotlin, a coerção pode ser explícita ou implícita, dependendo do contexto. Em alguns casos,
    o compilador do Kotlin fará a coerção automaticamente,
    enquanto em outros será necessário fazê-lo manualmente.
    */
    var pipokinha : Float = flutuante + inteiro //Coerção explícita
    var pipokinha2 = flutuante + inteiro // Coerção implícita

    println(pipokinha) //Teste das coerções
    println(pipokinha2)
}
