public class MinhaClasse {


    public static void main(String[] args) {

        String primeiroNome = "Gustavo";
        String segundoNome = "Rocha";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resulto do método: "  + primeiroNome.concat(" ").concat(segundoNome);
    }

}
