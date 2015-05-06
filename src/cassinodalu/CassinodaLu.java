package cassinodalu;

import javax.swing.JOptionPane;

public class CassinodaLu {

    public static void main(String[] args) {

        CadastroJogador jogo = new CadastroJogador();
        Jogos game = new Jogos();
        Integer opcao;
        String nm_usuario = null;
        
        do {
         if (jogo.conectado())
         {
             nm_usuario = jogo.getNome();
         }
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Cassino:\nBem vindo " + nm_usuario +
                    "\n1. Realizar Cadastro"
                    + "\n2. Entrar"
                    + "\n3. Inserir Cash"
                    + "\n4. Mostrar Cash"
                    + "\n5. Comprar Roupas"
                    + "\n6. Comprar Acessórios"
                    + "\n7. Comprar Sapatos"
                    + "\n8. Mostrar roupas em geral"
                    + "\n9. Jogo de Dados"
                    + "\n10. Jogo da Roleta"
                    + "\n0. Sair do Menu"));


            switch (opcao) {
                case 1: {
                    String nome, login, senha, confirm;

                    nome = JOptionPane.showInputDialog("Digite seu nome: ");
                    login = JOptionPane.showInputDialog("Digite seu login:");
                    senha = JOptionPane.showInputDialog("Digite sua senha:");
                    confirm = JOptionPane.showInputDialog("Digite novamente sua senha para confirmação:");
                    jogo.realizarCadastro(nome, login, senha, confirm);
                    break;
                }
                case 2: {
                    String login, senha;
                    login = JOptionPane.showInputDialog("Digite seu login:");
                    senha = JOptionPane.showInputDialog("Digite sua senha:");
                    
                    if (jogo.entrar(login, senha))
                    {
                        JOptionPane.showMessageDialog(null, "Bem-vindo " + jogo.getNome() + ". Agora você está logado!");
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Login ou senha invalidos! Tente novamente!");
                    }
                    break;

                }

                case 3: {
                    String cartao;
                    Double dinheiro;
                    cartao = JOptionPane.showInputDialog("Digite o número de seu cartão de crédito - deve conter 16 caracteres:");
                    dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Entre com o dinheiro:"));
                    jogo.inserirCash(cartao, dinheiro);
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "Seu cash é no total de:" + jogo.getCash());
                    break;
                }
                case 5: {
                    String roupas;
                    JOptionPane.showMessageDialog(null, "Escolha o item que deseja comprar"
                            + "\n1. Terno"
                            + "\n2. Smoking"
                            + "\n3. Vestido Rosa"
                            + "\n4. Tubindo dourado\n");
                    roupas = JOptionPane.showInputDialog("Entre com sua opção:");
                    jogo.comprarRoupa(roupas);
                    break;
                }

                case 6: {
                    String acessorios;
                    JOptionPane.showMessageDialog(null, "Escolha o item que deseja comprar"
                            + "\n1. Relógio Mormaii"
                            + "\n2. Óculos Camelinho"
                            + "\n3. Brinco e Colar"
                            + "\n4. Pulseira\n");
                    acessorios = JOptionPane.showInputDialog("Entre com sua opção:");
                    jogo.comprarAcessorios(acessorios);
                    break;
                }
                case 7: {
                    String sapatos;
                    JOptionPane.showMessageDialog(null, "Escolha o item que deseja comprar"
                            + "\n1. Scarpin"
                            + "\n2. All Star's"
                            + "\n3. Sapatilha"
                            + "\n4. Sapato Social\n");
                    sapatos = JOptionPane.showInputDialog("Entre com sua opção:");
                    jogo.comprarSapatos(sapatos);
                    break;
                }
               
                case 8: {
                    JOptionPane.showMessageDialog(null, "Roupas:\n" + jogo.getRoupa()
                            + "\nAcessórios:\n" + jogo.getAcessorios()
                            + "Sapatos:\n" + jogo.getSapatos());
                    break;
                }
                case 9: {
                    Integer num;
                    Double valor;
                    num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número de 1 a 12:"));
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com os golds que deseja apostar:"));
                    game.Dados(num, valor, jogo);
                    JOptionPane.showMessageDialog(null, "O NÚMERO SORTEADO FOI:" + game.num);


                    break;
                }
                case 10: {
                    int roletinha;
                    JOptionPane.showMessageDialog(null, "1.\n0-36 Números Únicos – Você pode apostar em "
                            + "um número e se ganhar receberá 35 para 1.\n"
                            + "2.\nPode apostar em 1-12 / 13-24 / 25-36 com "
                            + "pagamento de 2 para 1.\n"
                            + "3.\nPode apostar em 1-18 ou 19-36 com "
                            + "pagamento de 1 para 1.\n"
                            + "4.\nPode apostar em par ou ímpar com"
                            + "pagamento de 1 para 1.");

                   roletinha = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua opção:"));

                    switch (roletinha) {
                        case 1: {
                            Integer num;
                            Double valor;
                            num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número que deseja apostar:"));
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o dinheiro:"));
                            game.RodarRoleta(num, valor, jogo);
                            JOptionPane.showMessageDialog(null, "O número sorteado é:" + game.num);

                            break;
                        }
                        case 2: {
                            Integer nm, aposta ;
                            Double valor;
                            aposta = Integer.parseInt(JOptionPane.showInputDialog("Você deseja apostar em:\n1.  1-12\n2. 13-24\n3. 25-36\n :"));
                            nm = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número que deseja apostar:"));
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o dinheiro:"));
                            game.RodarRoleta2(aposta, nm, valor, jogo);
                            JOptionPane.showMessageDialog(null, "O número sorteado é:" + game.num);
                            break;

                        }

                        case 3: {
                            Integer numero, apostas;
                            Double valor;
                            apostas = Integer.parseInt(JOptionPane.showInputDialog("Você deseja apostar em:\n1.  1-18\n2. 19-36\n:"));
                            numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número que deseja apostar:"));
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o dinheiro:"));
                            game.RodarRoleta3(apostas, numero, jogo, valor);
                            JOptionPane.showMessageDialog(null, "O número sorteado foi:" + game.num);
                            break;
                        }

                        case 4: {
                            Integer numerozinho;
                            Double valor;

                            numerozinho = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número que deseja apostar:"));
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o dinheiro:"));
                            game.RodarRoleta4(numerozinho, valor, jogo);
                            JOptionPane.showMessageDialog(null, "O número sorteado é:" + game.num);
                            break;
                        }
                    }
                    break;
                }
                case 0: {
                    JOptionPane.showMessageDialog(null, "Tcahu! Volte Sempre!!!");
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(null, "Infelizmente essa opção não exite!");
                    break;
                }


            }
        } while (opcao != 0);
    }
}