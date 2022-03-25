public class Data{
	private int dia, mes, ano;

	public Data(){}
	public Data(int dia, int mes, int ano){
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}

	//getters
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;
	}

	//setters
	public void setDia(int dia){
		this.dia=dia;
	}
	public void setMes(int mes){
		this.mes=mes;
	}
	public void setAno(int ano){
		this.ano=ano;
	}


	//toString
	public String toString(){
		return this.dia+"/"+this.mes+"/"+this.ano;
	}


	//validarData
	public boolean validarData(int dia,int mes,int ano){
		if(ano>0){
			switch(mes){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia<=31) return true;
					break;
				case 2:
					if(ano%4==0){
						if(dia<=29) return true;
					}
					else{if(dia<=28) return true;}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(dia<=30) return true;
					break;
				default:
					break;
			}
		}
		return false;
	}

}

import java.util.Scanner;

public class Exercicio{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia,mes,ano;
		System.out.print("Digite o dia: ");
		dia = entrada.nextInt();
		System.out.print("Digite o mês: ");
		mes = entrada.nextInt();
		System.out.print("Digite o ano: ");
		ano = entrada.nextInt();



		Data calendario = new Data(dia,mes,ano);
		if(calendario.validarData(dia,mes,ano)){
			System.out.print(calendario.getDia());
		}else{
			System.out.print("False");
		}
	}
}


/ #Renato Barbosa
