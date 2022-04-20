package metodos;

import atributos.Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    public static void seumenu() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        Scanner entradastring = new Scanner(System.in);
        Scanner datastring = new Scanner(System.in);
        ArrayList<Classes> alunoarrays = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("==============================================MENU=================================");
            System.out.println("Opções: ");
            System.out.print("1 - Cadastrar aluno");
            System.out.print(" | 2 - Mostrar alunos");
            System.out.print(" | 3 - Atualizar alunos");
            System.out.print("| 4 - remover");
            System.out.println(" | 5 - sair");
            System.out.print("Digite a opção: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                //Cadastrar alunos
                case 1: {
                    System.out.println();
                    System.out.print("Nome: ");
                    String pessoaCadastro = entradastring.nextLine();
                    System.out.print("Data de nascimento: (dd/MM/yyyy) -> ");
                    String datanascCadastro = datastring.next();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = formatter.parse(datanascCadastro);
                    System.out.print("Telefone: ");
                    long telefoneCadastro = entrada.nextLong();
                    System.out.print("Nota: ");
                    int notaCadastro = entrada.nextInt();

                    Date dataCadastro = new Date();

                    Classes alunos = new Classes();
                    alunos.setPessoa(pessoaCadastro);
                    alunos.setDatadenasc(datanascCadastro);
                    alunos.setTelefone(telefoneCadastro);
                    alunos.setNota(notaCadastro);
                    alunos.setDatavar(String.valueOf(dataCadastro));
                    System.out.println();

                    alunoarrays.add(alunos);
                    break;
                }
                //Listar todos os alunos cadastrados
                case 2: {
                    System.out.println("==================================Alunos==================================");
                    for (int i = 0; i < alunoarrays.size(); i++) {

                        Classes uTemp = alunoarrays.get(i);
                        System.out.println("Id: " + i);
                        System.out.println("Nome: " + alunoarrays.get(i).getPessoa());
                        System.out.println("Data de nascimento: " + alunoarrays.get(i).getDatadenasc());
                        System.out.println("Telefone: " + alunoarrays.get(i).getTelefone());
                        System.out.println("Nota final: " + alunoarrays.get(i).getNota());
                        System.out.println("Data do cadastro -> " + alunoarrays.get(i).getDatavar());
                        System.out.println();
                    }
                    break;
                }
                //atualizar
                case 3: {
                    System.out.println("==========================Atualização dos alunos===========================");

                    for (int i = 0; i < alunoarrays.size(); i++) {

                        Classes percorre = alunoarrays.get(i);

                        System.out.println("[" + i + "] " + percorre.getPessoa());
                    }

                    System.out.print("Digite o id do aluno: ");
                    int id = entrada.nextInt();


                    System.out.print("Nome: ");
                    String novoNome = entradastring.nextLine();
                    System.out.print("Data de nascimento: (dd/MM/yyyy) -> ");
                    String datanascNova = datastring.next();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = formatter.parse(datanascNova);
                    System.out.print("Telefone: ");
                    long novoTelefone = entrada.nextLong();
                    System.out.print("Nota final: ");
                    int novaNota = entrada.nextInt();

                    Date dataAtualizacao = new Date();

                    Classes alunos = alunoarrays.get(id);
                    alunos.setPessoa(novoNome);
                    alunos.setDatadenasc(datanascNova);
                    alunos.setTelefone(novoTelefone);
                    alunos.setNota(novaNota);
                    alunos.setDatavar(String.valueOf(dataAtualizacao));

                    System.out.println("-----------------------------Data da atualização-----------------------------");
                    System.out.println("Data de cadastro do aluno " + novoNome + ": " + dataAtualizacao);
                    System.out.println();

                    break;
                }
                //remover
                case 4: {
                    System.out.println("===============================Remover Aluno===============================");

                    for (int i = 0; i < alunoarrays.size(); i++) {

                        Classes percorre = alunoarrays.get(i);

                        System.out.println("[" + i + "] " + percorre.getPessoa());
                    }
                    System.out.println("Digite o id: ");
                    int id = entrada.nextInt();

                    alunoarrays.remove(id);
                    break;
                }
                //sair
                case 5: {
                    System.out.println("Adeus...");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Ops...Você não digitou nenhuma das opções ");
                    break;
            }
        }
    }
}

