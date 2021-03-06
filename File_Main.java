import javax.swing.JOptionPane;

public class Exerc {
	public static void main(String args[]) {
		int tamanho_vetor,contador,contador_preco=0,contador_40=0;
		tamanho_vetor=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de produtos que deseja adicionar : "));
		double preco_prod[]= new double[tamanho_vetor],media=0;
		String nome_prod[]=new String[tamanho_vetor], resultado="";
		for(contador=0;contador<tamanho_vetor;contador++) {
		     nome_prod[contador]=JOptionPane.showInputDialog("Digite o nome do produto : ");
			 preco_prod[contador]=Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto : "));	
			 if(preco_prod[contador]<40) {
					contador_40++;
			 }else if(preco_prod[contador]>40&&preco_prod[contador]<100){	
				 resultado = resultado +""+nome_prod[contador]+"\n";
				}else {
					contador_preco++;
					media+=preco_prod[contador];	
				}	
		}
		 if(resultado.equals("")){
			 resultado+="\n Nenhum produto entre 40 e 100 reais cadastrado.";
		 }
		 System.out.println("."+resultado+".");
		 if(contador_preco!=0) {
				media/=contador_preco;
				}
		 JOptionPane.showMessageDialog(null,"Preço dos produtos entre 40 e 100 reais :\n"+resultado+"\n produtos com preço menor que 40 = "+contador_40+"\n"
		 		+ "media dos produtos maiores que 100: "+media);
	}
}
