package companionobject
fun main() {

/*Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
e pelo menos mais duas opções de construtores conforme sua percepção, com os atributos:
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio,
jogue uma exceção. Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro
de um bloco try catch.
 */

    try {
        val cliente1 = Cliente("Fernanda", "Rua Lopes Trovão", "19987421830")
        println(cliente1)

        cliente1.cadProduto("Abacaxi")
        cliente1.cadProduto("Melão")
        cliente1.cadProduto("Mandioca")
        cliente1.cadProduto("Goiaba")

        println("Itens cadastrados com sucesso")
        cliente1.listasItem()


        cliente1.remproduto("Goiaba")
        println("Itens removido com sucesso")
        cliente1.listasItem()

    } catch (e: Exception) {
        println(e.message)


    }
}
