
package companionobject   //Cadastro de Cliente

class Cliente constructor(private var nome: String) {

    private var endereco = ""
    private var telefone = ""
    private var listadeCompra = mutableListOf<String>()

    constructor(
        nome: String, endereco: String, telefone: String
    ) :
            this(
                nome
            ) {
        this.endereco = endereco
        this.telefone = telefone
    }

    constructor(
        nomeCompleto: String, endereco: String, telefone: String,
        listadeCompra: MutableList<String>
    ) : this(
        nomeCompleto, endereco, telefone
    ) {
        this.listadeCompra = listadeCompra
    }

    init {
        if (nome.isEmpty() && endereco.isEmpty() && telefone.isEmpty()) {
            throw Exception("Classe instanciada de maneira incorreta!")
        } else {
            println("Classe instanciada com sucesso!")
        }
    }

    override fun toString(): String {
        return "\n Nome - $nome" +
                "\n Endereco - $endereco" +
                "\n Telefone - $telefone"
    }

    fun cadProduto(produto: String) {
        if (produto.isEmpty()) {
            println("Curso inválido")
        } else {
            listadeCompra.add(produto)
        }
    }

    fun remproduto(produto: String) {

        if (produto.isEmpty()) {
            println("Produto inválido")
        } else if (listadeCompra.contains(produto)) {
            listadeCompra.remove(produto)
            println("Produto removido com sucesso")
        } else {
            println("Esse produto não exite na lista")
        }
    }

    fun listasItem() {
        listadeCompra.forEach {
            println(it)
        }
    }
}