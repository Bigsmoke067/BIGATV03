  import java.time.LocalDate;
  public class Professor extends Pessoa{  
    
      
      private String Registro;
      private LocalDate dataContratacao;

    public Professor(){

    }
      
      public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg, String cpf, LocalDate dataInsercao, String Registro, LocalDate dataContratacao){
      super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);//Heranca
      this.Registro = Registro;
      this.dataContratacao = dataContratacao; 
      //CONSTRUTOR
      
        }
      

      public void setRegistro(String registro) {
        Registro = registro;
      }

      public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
      }

      public String getRegistro() {
        return Registro;
      }

      public LocalDate getDataContratacao() {
        return dataContratacao;
      }

      



      public static void main(String[] args) {
          
        
        Professor Professor1 = new Professor(123, "Carlos", "Rua larica 357", "67991293528",  LocalDate.of(1990, 05, 07), "2359135"," 79110030", LocalDate.of(1980, 07, 17), "380", LocalDate.of(2000, 07, 17));
        
        System.out.println("Nome do Professor: " + Professor1.getNome());
        System.out.println("Codigo do Professor: " + Professor1.getCodigo());
        System.out.println("Endereco do Professor: " + Professor1.getEndereco());
        System.out.println("Telefone do Professor: " + Professor1.getTelefone());
        System.out.println("Data de Nascimento do Professor: " + Professor1.getDataNascimento());
        System.out.println("Rg do Professor: " + Professor1.getRg());
        System.out.println("Cpf do Professor: " + Professor1.getCpf());
        System.out.println("Registro do Professor: " + Professor1.getRegistro());
        System.out.println("Data de contratacao do Professor: " + Professor1.getDataContratacao());
      
      
      
      
      } 
      
    } 
      
      
