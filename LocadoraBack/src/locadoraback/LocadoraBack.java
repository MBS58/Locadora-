package locadoraback;

import Util.Conexao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class LocadoraBack {
    public static void main(String[] args) throws ParseException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        Cliente cli     = new Cliente();
        /*
        // incluir cliente OK !
        cli.setNomeCliente("Maria Jose Ferreira");
        cli.setEmail("mariajosef@gmail.com");
        cli.setFoneCel("(47)99687-8899");
        if (cli.incluirCliente()){
            System.out.println("Cliente incluido com sucesso");
        } else {
            System.out.println("Deu problema na inclusao do cliente");
        }
        */
        /*
        // alterar Cliente OK !
        cli.setCodCliente(1);
        cli.setNomeCliente("Maria Jose Ferreira");
        cli.setEmail("mariajosef@gmail.com");
        cli.setFoneCel("(47)99687-8899");
        if (cli.alterarCliente()){
            System.out.println("Cliente alterado com sucesso");
        } else {
            System.out.println("Deu problema na alteracao do cliente");
        }
        */
        /*
        // excluir Cliente OK !
        cli.setCodCliente(1);
        if (cli.alterarCliente()){
            System.out.println("Cliente excluido com sucesso");
        } else {
            System.out.println("Deu problema na excluido do cliente");
        }
        */
        /*
        // consulta UM cliente
        cli.setCodCliente(1);

        Cliente cli2 = cli.consultarCliente();
        if (cli2 == null) {
            System.out.println("Não localizei o cliente");
        } else {
            System.out.println("Codigo....:" + cli.getCodCliente());
            System.out.println("Nome .....:" + cli2.getNomeCliente());
            System.out.println("Email.....:" + cli2.getEmail());
            System.out.println("FoneCel...:" + cli2.getFoneCel());
        }
        */
        List<Cliente> listarClientes = new ArrayList<>();
        listarClientes = cli.consultarClienteS();
        if (listarClientes != null) {
            System.out.println("Codigo" +  "\t" + "Nome            " + "\t" + 
                               "Email " + "\t"+ "Fone");
        }
        
        for (Cliente l : listarClientes) {
           System.out.println(l.getCodCliente() + "\t" + 
                              l.getNomeCliente() + "\t" + 
                              l.getEmail() + "\t" + 
                              l.getFoneCel());  
        }
        
        /*
        System.out.println("Informe o salario atual");
        double salarioAtual = sc.nextDouble();
        System.out.println("Informe o % de aumento");
        double percAumento = sc.nextDouble();
        
        double novoSalario = cli.reajustarSalario(salarioAtual, percAumento);
        System.out.println("Salario Novo " + novoSalario);
        
        System.out.println(cli.toString());
        */
        /*
        Veiculo vei = new Veiculo();
        vei.setCodVeiculo(1);
        vei.setMarcaVeiculo("Citroen");
        vei.setModeloVeiculo("C3");
        vei.setPlacaVeiculo("ABC0123");
        vei.setLocado(false);
        System.out.println(vei.toString());
        */
        /*
        Locacao loc = new Locacao();
        loc.setCodCliente(1);
        loc.setCodVeiculo(1);
        // formatando data para setar o atributo tipo date na classe
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        var dataFormatada = sdf.parse("19/03/2024");
        loc.setDataLocacao(dataFormatada);
        dataFormatada = sdf.parse("18/03/2024");
        loc.setDataReserva(dataFormatada);
        loc.setDataDevolucao(null);
        loc.setKmInicial(88756);
        loc.setKmFinal(0);
        loc.setDanosVeiculo(false);
        System.out.println(loc.toString());
        
        // exemplo de saída de um campo Date
        var dataSaida = sdf.format(loc.getDataLocacao());
        System.out.println("data locacao : " + dataSaida);
    
        // cadastrar um automovel
        Automovel a1 = new Automovel();
        a1.setCodVeiculo(1);
        a1.setMarcaVeiculo("Renault");
        a1.setModeloVeiculo("Kwid");
        a1.setPlacaVeiculo("AF045I2");
        a1.setLocado(true);
        a1.setPotenciaHP(85);
        a1.setQtdPassageiros(4);
        a1.imprimirDadosVeiculo(); 
        if (a1.abastecer("Alcool", 0, 5.80f)){
            System.out.println("Veiculo concluiu abastecimento");
        } else {
            System.out.println("Ocorreram problemas no abastecimento");
        }
        
        // Cadastrando um caminhao
        Caminhao c1 = new Caminhao();
        c1.setCodVeiculo(1000);
        c1.setMarcaVeiculo("FORD");
        c1.setMarcaVeiculo("F350");
        c1.setPlacaVeiculo("CHK4578");
        c1.setLocado(false);
        c1.setPotenciaHP(650);
        c1.setQtdEixos(5);
        c1.setTipoCaminhao('C'); // carreta 27 m
        c1.imprimirDadosVeiculo();
        
        if (c1.abastecer("Diesel", 120, 6.50f)){
            System.out.println("Calculo de rodagem completo");
        } else {
            System.out.println("Ocorreram problemas no calculo");
        }
*/
    }
}