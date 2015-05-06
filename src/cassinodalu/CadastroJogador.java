package cassinodalu;

public class CadastroJogador {

    private String nome;
    private String senha;
    private String login;
    private Double gold;
    private Double cash;
    private Boolean jogando;
    private String roupa;
    private String acessorios;
    private String sapatos;

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)  
    {
        this.senha = senha;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login) 
    {
        this.login = login;
    }

    public Double getGold()
    {
        return gold;
    }

    public void setGold(Double gold) 
    {
        this.gold = gold;
    }

    public Double getCash()
    {
        return cash;
    }

    public void setCash(Double cash) 
    {
        this.cash = cash;
    }

    public Boolean isJogando()
    {
        return jogando;
    }

    public void setJogando(Boolean jogando)
    {
        this.jogando = jogando;
    }

    public String getRoupa() 
    {
        return roupa;
    }

    public void setRoupa(String roupa)
    {
        this.roupa = roupa;
    }

    public String getAcessorios() 
    {
        return acessorios;
    }

    public void setAcessorios(String acessorios) 
    {
        this.acessorios = acessorios;
    }

    public String getSapatos()
    {
        return sapatos;
    }

    public void setSapatos(String sapatos)
    {
        this.sapatos = sapatos;
    }

    CadastroJogador() 
    {
        this.nome = null;
        this.senha = null;
        this.login = null;
        this.gold = 0.0;
        this.cash = 0.0;
        this.jogando = false;
        this.roupa = null;
        this.acessorios = null;
        this.sapatos = null;
    }
    
      public Boolean realizarCadastro (String nome1, String login1, String senha1, String confirm1 )
        {
            if (senha1.equals(confirm1))
            {
            nome = nome1;
            login = login1;
            senha = senha1;
            gold = 50.0;
            cash = 0.0;
            jogando = false;
            roupa = "Calça e camisa";
            acessorios = "Relógio de camelô";
            sapatos = "Chinelo rider";
            
            return true; 
            }
            
            else 
            {
                return false;
            }
            
            
        }
        
       public Boolean entrar (String login2, String senha2) 
        {
            if (login2.equals(login) && senha2.equals(senha))
            {
                jogando = true;
                return true;
            }
            else
            {
                return false;
            }
        }

        
    public Boolean conectado () {
        return jogando;
    }

    public Boolean inserirCash(String num_cartao, Double vlreais) {
        
        if (jogando == true) 
        {
            int cartao = num_cartao.length();

            if (cartao == 16) 
            {
                if (vlreais <= 10)
                {
                    cash = cash + vlreais;
                }
                else if (vlreais >= 11 && vlreais <= 50)
                {
                    cash = cash + vlreais * 2;
                }
                else if (vlreais > 50)
                {
                    cash = cash + vlreais * 3;
                }
                else
                {
                    return false;
                }

                return true;
            } 
            else
            {
                return false;
            }

        } 
        else 
        {
            return false;
        }

    }

    public Boolean comprarRoupa(String compra) {
        
        if (jogando == true && cash != 0.0)
        {
            if (cash >= 40) 
            {
                compra = compra + "Terno";
                cash = cash - 40;
            } 
            else if (cash >= 45) 
            {
                compra = compra + "Smoking";
                cash = cash - 45;
            }
            else if (cash >= 35)
            {
                compra = compra + "Vestido Rosa";
                cash = cash - 35;
            }
            else if (cash >= 55) 
            {
                 compra = compra + "Tubinho Dourado";
                cash = cash - 55;
            }
            else if (cash < 35)
            {
                return false;
            }

            return true;
        } 
        else 
        {
            return false;
        }
    }

    public Boolean comprarAcessorios(String frescuras) {
        
        if (jogando == true && cash != 0.0) 
        {
            if (cash >= 60)
            {
                frescuras = frescuras + "Relógio Mormaii";
                cash = cash - 60;
            }
            else if (cash >= 30)
            {
                frescuras = frescuras + "Óculos Camelinho";
                cash = cash - 30;
            } 
            else if (cash >= 50)
            {
                frescuras = frescuras + "Brinco e Colar";
                cash = cash - 50;
            }
            else if (cash >= 20)
            {
                frescuras = frescuras + "Pulseira";
                cash = cash - 20;
            }
            else if (cash < 20) 
            {
                return false;
            } 

            return true;
        } 
        else
        {
            return false;
        }
    }

    public Boolean comprarSapatos(String shoes) {
        
        if (jogando == true && cash != 0.0) 
        {
            if (cash >= 55)
            {
                shoes = shoes + "Scarpin";
                cash = cash - 55;
            }
            else if (cash >= 50)
            {
                shoes = shoes + "All Star's";
                cash = cash - 50;
            }
            else if (cash >= 35)
            {
                shoes = shoes + "Sapatilha";
                cash = cash - 35;
            }
            else if (cash >= 60) 
            {
                shoes = shoes + "Sapato Social";
                cash = cash - 60;
            }
            else if (cash < 35)
            {
                return false;
            } 

            return true;
        } 
        else 
        {
            return false;
        }
    }
    
   public void Adicionar(Double valor) {
       
            this.cash = this.cash + valor;
        }
   
   public void Retirar (double valor)    {
       
            this.cash = this.cash - valor;
        }
        
}

