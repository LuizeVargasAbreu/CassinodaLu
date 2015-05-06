package cassinodalu;

public class Jogos {

    Integer num;
    Double gold1;

    Jogos()
    {
        this.num = 0;
        this.gold1 = 50.0;
    }

    public void ZerarNum() {
        this.num = 0;
    }

    public Integer Dados(Integer num, Double gold1, CadastroJogador jogo) {
        Integer dado1;
        Integer dado2;
        Integer resultado;
        ZerarNum();
        
        if (jogo.getCash() >= gold1)
        {
            jogo.Retirar(gold1);
            do 
            {
                dado1 = (int) (Math.random() * 6);
            } while (dado1 == 0);

            do
            {
                dado2 = (int) (Math.random() * 6);
                
            } while (dado2 == 0);

            resultado = dado1 + dado2;
            this.num = resultado;

            if (resultado == num)
            {
                this.gold1 = gold1 * 12;
                jogo.Adicionar(this.gold1);
                return resultado;
            }
            else if (resultado == (num - 1) || resultado == (num + 1))
            {
                this.gold1 = gold1 * 5;
                jogo.Adicionar(this.gold1);
                return resultado;
            }
            else if (resultado != num)
            {
                this.gold1 = gold1 = 0.0;
                return resultado;
            }
            else
            {
                return resultado;
            }
        }

        return this.num;
    }

    public Integer RodarRoleta(Integer num, Double gold1, CadastroJogador jogo) {

        Integer roleta;
        Double valor;
        ZerarNum();
        
        if (jogo.getCash() >= gold1)
        {

            jogo.Retirar(gold1);
            do
            {
                roleta = (int) (Math.random() * 36);
                
            } while (roleta == 0);

            this.num = roleta;

            if (num == roleta) 
            {
                valor = gold1 * 35;
                jogo.Adicionar(valor);
                return roleta;

            }
            else 
            {
                return this.num;
            }
        }

        return this.num;
    }

    public Integer RodarRoleta2(Integer opcao, Integer num, Double gold1, CadastroJogador jogo) {
        Integer roleta;
        Double valor;
        ZerarNum();
        
        if (jogo.getCash() >= gold1) 
        {
            jogo.Retirar(gold1);
            if (opcao == 1) {
                do {
                    roleta = (int) (Math.random() * 12);
                } while (roleta < 0);

                this.num = roleta;

                if (num == roleta)
                {
                    valor = gold1 * 2;
                    jogo.Adicionar(valor);
                    return roleta;
                }

                return this.num;
            }
            else if (opcao == 2) {
                do {
                    roleta = (int) (Math.random() * 24);
                    
                } while (roleta < 12);
                
                this.num = roleta;

                if (num == roleta) 
                {
                    valor = gold1 * 2;
                    jogo.Adicionar(valor);
                    return roleta;
                }
                return this.num;

            }

            else if (opcao == 3) {
                do {
                    roleta = (int) (Math.random() * 36);
                    
                } while (roleta < 24);
                
                this.num = roleta;
                
                if (num == roleta)
                {
                    valor = gold1 * 2;
                    jogo.Adicionar(valor);
                    return roleta;
                }
                return this.num;
            }

        }
        else
        {
            return this.num;
        }
        return this.num;
    }

    public Integer RodarRoleta3(Integer opcao, Integer num, CadastroJogador jogo, Double gold1) {
        
        Integer roleta;
        Double valor;
        ZerarNum();
        
        if (jogo.getCash() >= gold1)
        {               
            jogo.Retirar(gold1);
            if (opcao == 1)
            {
                do {
                    roleta = (int) (Math.random() * 18);
                } while (roleta < 0);
                
                if (num == roleta)
                {
                    valor = gold1 * 1;
                    jogo.Adicionar(valor);
                    this.num = roleta;
                }

            }
            if (opcao == 2) {

                do {
                    roleta = (int) (Math.random() * 36);
                } while (roleta < 18);

                if (num == roleta) 
                {
                    valor = gold1 * 1;
                    jogo.Adicionar(valor);
                    this.num = roleta;

                }
            }

        }
        return this.num;

    }

    public Integer RodarRoleta4(Integer num, Double gold1, CadastroJogador jogo) {
        Integer roleta;
        Double valor;
        ZerarNum();
        
        if (jogo.getCash() >= gold1) 
        {
            jogo.Retirar(gold1);
            
            do {
                roleta = (int) (Math.random() * 36);
            } while (roleta < 0);

            if (roleta % 2 == 0 && roleta == num) 
            {
                valor = gold1 * 1;
                jogo.Adicionar(valor);
                this.num = roleta;

            }
            else if (roleta % 3 == 1 && roleta == num) 
            {
                valor = gold1 * 1;
                jogo.Adicionar(valor);
                this.num = roleta;
            }
        }
        return this.num;
    }

}
