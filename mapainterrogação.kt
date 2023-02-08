import kotlin.math.pow
import kotlin.math.sqrt

class Ponto2d(var x: Int=0, var y: Int=0) {
    fun distancia(enxerido: Ponto2d): Double {
        var deltax = (enxerido.x-this.x)
        var deltay = (enxerido.y-this.y)
        var dist = sqrt(deltax.pow(2) + deltay.pow(2))
        return dist
    }
}
//Criação da Classe

fun main() { //
    var ponto1 = Ponto2d()
    var ponto2 = Ponto2d(2,2)


println("Coordenadas: (${ponto1.x}, ${ponto1.y})")
println(ponto1.distancia(ponto2))

}