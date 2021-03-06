package Main_files;
import javax.swing.JOptionPane;
import Calculos.Calcular;
import Classes.Produtos_e_Precos;
public class Exercicio {
public static void main (String args[]) {
	Calcular calc=new Calcular();
	int tamanho_vetor,contador;
	tamanho_vetor=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de produtos que deseja adicionar : "));
	double[] preco_prod= new double[tamanho_vetor];
	String[] nome_prod=new String[tamanho_vetor];
	Produtos_e_Precos[] prod=new Produtos_e_Precos[tamanho_vetor];
	String resultado="Preço dos produtos entre 40 e 100 reais : \n";
	for(contador=0;contador<tamanho_vetor;contador++) {
		 prod[contador]=new Produtos_e_Precos();
		 prod[contador].setNome(nome_prod[contador]=JOptionPane.showInputDialog("Digite o nome do produto : "));
		 prod[contador].setPreco(preco_prod[contador]=Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto : ")));	 
		 calc.Calcular_infeior_40(prod[contador].getPreco());
		 calc.Media_maior_100(prod[contador].getPreco());
		 calc.Calcular_Entre40_100(prod[contador].getPreco());
		 if(calc.getSeparar()!=0) {
			 resultado = resultado +""+prod[contador].getNome()+"\n";
			 }		 
		 }	
	 calc.Media_100();
	 if(resultado.equals(" ")) {
		 resultado="Nenhum produto entre 40 e 100 reais cadastrado.";
	 }
	 JOptionPane.showMessageDialog(null,""+resultado+"\n produtos com preço menor que 40 = "+calc.getContador()+"\n"
	 		+ "media dos produtos maiores que 100: "+calc.getMedia());
	 }
}
