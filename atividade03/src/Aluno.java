import java.time.LocalDate;
public class Aluno extends Pessoa {
   
    private String Matricula;
    private LocalDate dataMatricula;

    public Aluno(){

    }
    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg, String cpf, LocalDate DataInsercaoAluno, String Matricula, LocalDate dataMatricula){
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, DataInsercaoAluno);
        this.Matricula = Matricula;
        this.dataMatricula = dataMatricula;
    }
    public String getMatricula() {
        return Matricula;
    }
    public void setMatricula(String matricula) {
        Matricula = matricula;
    }
    public LocalDate getdataMatricula() {
        return dataMatricula;
    }
    public void setdataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
  

    public static void main(String [] args){

    Aluno Aluno1 = new Aluno(1234, "Juca", "Lambisgoia 831", "67991595858", LocalDate.of(2000, 4, 22), "2349155", "08379170", LocalDate.of(2001, 7, 18), "88778", LocalDate.of(2002, 4, 21));   

    System.out.println("Nome do Aluno: " + Aluno1.getNome());
    System.out.println("Código do Aluno: " + Aluno1.getCodigo());
    System.out.println("Endereço do Aluno: " + Aluno1.getEndereco());
    System.out.println("Telefone do Aluno: " + Aluno1.getTelefone());
    System.out.println("Data de Nascimento do Aluno: " + Aluno1.getDataNascimento());
    System.out.println("RG do Aluno: " + Aluno1.getRg());
    System.out.println("CPF do Aluno: " + Aluno1.getCpf());
    System.out.println("Data de Inserção do Aluno: " + Aluno1.getDataInsercao());
    System.out.println("Matrícula do Aluno: " + Aluno1.getMatricula());
    System.out.println("Data de Matrícula do Aluno: " + Aluno1.getdataMatricula());
    }
    
}
