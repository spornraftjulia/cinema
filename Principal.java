public class Principal {

    public static void main(String[] args) {
        Filme f=new Filme();
        f.setCodigo(13);
        f.setNome("Julia");
        f.setValor(24.50);


        f.setDisponivel(false);
        if(f.isDisponivel()){
            System.out.println(f.getCodigo());
            System.out.println(f.getNome());
            System.out.println(f.getValor());
        } else {
            System.out.println("Filme não disponível");
        }
    }
}