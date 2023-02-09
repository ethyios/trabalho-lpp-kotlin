import kotlin.math.pow
import kotlin.math.sqrt


class Ponto2d(var x: Int=0, var y: Int=0) { //Declaração da classe com duas variáveis
                                            //Que representam as coordenadas.
    fun distancia(enxerido: Ponto2d): Float { //Método que calcula a distância
        var dist = sqrt(
            ((enxerido.x-this.x).toFloat()).pow(2)
            +
            ((enxerido.y-this.y).toFloat()).pow(2)
        )
        return dist
    }

    fun eigual(otenxerido: Ponto2d): Boolean { //Método que calcula se os pontos
        if (this.distancia(otenxerido) == 0f) { //são iguais.
            return true
        }
        else {
            return false
        }
    }
}


fun main() { //
    var ponto1 = Ponto2d()
    var ponto2 = Ponto2d(2,2)
    var ponto3 = Ponto2d()


println("Coordenadas: (${ponto1.x}, ${ponto1.y})")
println(ponto1.distancia(ponto2))
println(ponto1.eigual(ponto2))
println(ponto1.eigual(ponto3))

}