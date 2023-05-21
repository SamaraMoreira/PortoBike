import documentos.Rg;

import javax.swing.*;
import documentos.Rg;
import info_bike.Bike;
import pessoa.Pessoa;
import endereco.Endereco;

import static java.lang.System.exit;


public class Main {
        static int terminar = 0;
    public static void main(String[] args) {
            do{
                    JOptionPane.showMessageDialog(null,"Complete os dados para cadastro ");
                    var idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
                    if (idade <18) {
                            JOptionPane.showMessageDialog(null, "Infelizmente apenas vistoria para maiores de idade ");
                            exit(0);
                    }

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(JOptionPane.showInputDialog("Informe o seu nome completo:"));
            pessoa.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Informe o cpf:")));
            pessoa.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Informe o telefone:")));

            Rg rg = new Rg();
            rg.setData(JOptionPane.showInputDialog("Informe a data de emissão do seu Rg:"));
            rg.setEstado_emissor(JOptionPane.showInputDialog("Informe o estado de emissão"));
            rg.setOrgao_emissor(JOptionPane.showInputDialog("Informe o Orgâo emissor:"));
            rg.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do seu rg:")));

            Endereco endereco = new Endereco();
            endereco.setCep(Integer.parseInt(JOptionPane.showInputDialog("Informe o cep:")));
            endereco.setRua(JOptionPane.showInputDialog("Informe o nome da sua rua:"));
            endereco.setCidade(JOptionPane.showInputDialog("Informe o nome da sua cidade:"));
            endereco.setBairro(JOptionPane.showInputDialog("Informe o nome do seu bairro:"));
            endereco.setComplemento(JOptionPane.showInputDialog("Importe um complemento:"));
            endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da residencia:")));



            Bike bk = new Bike();
            bk.setValor_bike(Double.valueOf(JOptionPane.showInputDialog("Informe o valor pago na bike")));
            bk.setMarca_bike(JOptionPane.showInputDialog("Informe a marca:"));
            bk.setTipo_bike(JOptionPane.showInputDialog("Informe o tipo da bike:"));
            bk.setUtl_bike(JOptionPane.showInputDialog("Informe a utilidade da bike:"));
            bk.setAno_bike(Integer.parseInt(JOptionPane.showInputDialog("Informe o cano da compra:")));



            String info = "Informações:\n" +
                            "Nome: " + pessoa.getNome() + "\n" +
                            "CPF: " + pessoa.getCpf() + "\n" +
                            "Telefone: " + pessoa.getTelefone() + "\n" +
                            "Data de emissão do RG: " + rg.getData() + "\n" +
                            "Estado emissor do RG: " + rg.getEstado_emissor() + "\n" +
                            "Órgão emissor do RG: " + rg.getOrgao_emissor() + "\n" +
                            "Número do RG: " + rg.getNumero() + "\n" +
                            "CEP: " + endereco.getCep() + "\n" +
                            "Rua: " + endereco.getRua() + "\n" +
                            "Cidade: " + endereco.getCidade() + "\n" +
                            "Bairro: " + endereco.getBairro() + "\n" +
                            "Complemento: " + endereco.getComplemento() + "\n" +
                            "Número da residência: " + endereco.getNumero() + "\n" +
                            "Valor pago na bike: " + bk.getValor_bike() + "\n" +
                            "Marca da bike: " + bk.getMarca_bike() + "\n" +
                            "Tipo da bike: " + bk.getTipo_bike() + "\n" +
                            "Utilidade da bike: " + bk.getUtl_bike() + "\n" +
                             "Ano da compra da bike: " + bk.getAno_bike();

            int confirmacao = JOptionPane.showConfirmDialog(null, info + "\n\nAs informações estão corretas?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                            terminar = 1; // Encerra o loop
                    } else {
                            terminar = 2; // Continua o loop
                    }

            } while (terminar != 1);

            int vistoria = JOptionPane.showConfirmDialog(null, "Deseja ser enviado para vistoria?", "Vistoria", JOptionPane.YES_NO_OPTION);
            if (vistoria == JOptionPane.YES_OPTION) {
                    System.out.println("Informações enviadas para vistoria.");
            } else {
                    System.out.println("Informações não enviadas para vistoria.");
            }








    }
}