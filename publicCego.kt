private class Privadora(private var secreta: String = "variável protegida dentro de classe protegida",
    protected var protege: String = "var protegida dentro de classe privada",
    public var soltinha: String = "var soltinha dentro de classe privada"
    ) {
    public class Subclasse(var supersolta: String = "Sou soltinha soltinha")
    //Esse programa não vai compilar, pois o main chama uma variável para a qual n tem acesso.
}

fun main() {
    var enxerida = Privadora() //Classe privada, pode ser acessada dentro do mesmo arquivo
    var dancarina = Privadora.Subclasse() //Subclasse pública, pode ser acessada de qualquer lugar
    
    println(enxerida.secreta) //Se o main tivesse acesso, imprimiria o conteúdo da secreta
    println(enxerida.soltinha) //O main tem acesso a esse atributo pois
                             //está no mesmo arquivo que a declaração
    println(dancarina.supersolta) //Tudo tem acesso a supersolta.
}