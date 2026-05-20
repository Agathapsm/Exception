public class Produto {

    private int id;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws MyException {
        if (descricao == null || descricao.length() == 0 ) {
            throw new MyException("Coloque uma descrição!");
        }
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws MyException {
        if (id <= 0) {
            throw new MyException("Id não pode ser 0 ou negativo");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", id=" + id +
                '}';
    }
}
