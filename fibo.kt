fun fibonacci(n: Int): Int{ 
  if(n <= 0)
    	return 0
    else if(n == 1 || n == 2)
    	return 1
    else
    	return fibonacci(n - 2) + fibonacci(n - 1)
    
}

fun main() {
    print("Digite um valor inteiro: ")
    
    val num = readLine()!!.toInt()
    
    if(num < 0) //Abaixo exemplo de exceção, resposta da 21.
      throw IllegalArgumentException("Valor negativo nao e permitido.")
  
    val fib = fibonacci(num)
    
    println("Fibonacci($num) = $fib")
    
}