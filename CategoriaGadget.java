public class CategoriaGadget {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String codigo = scanner.nextLine();
        String categoria = identificarCategoria(codigo);
        System.out.println(categoria);
        scanner.close();
    }

    // Função principal que identifica a categoria do gadget
    public static String identificarCategoria(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return "unknown";
        }

        char inicial = Character.toUpperCase(codigo.charAt(0));

        switch (inicial) {
            case 'T':
                return "tablet";
            case 'P':
                return "phone";
            case 'N':
                return "notebook";
            default:
                return "unknown";
        }
    }
}