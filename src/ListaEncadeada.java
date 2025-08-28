public class ListaEncadeada {
    private No<T> inicio;

    public void inserirNoInicio(T valor){
        No<T> novoNo = new No<>(valor);
        if (inicio == null){
            novoNo.getProximo(this.inicio);
        }
        this.inicio = novoNo;
    }
}
