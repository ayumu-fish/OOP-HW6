package fcu.iecs.oop.pokemon;


public class GYM {
	public static Player fight(Player p1,Player p2)
	{
		int win1=0,win2=0;
		
		for(int i=0;i<3;i++)
		{
			if(p1.getPokemons()[i].getType()!=p2.getPokemons()[i].getType())
			{
				if(p1.getPokemons()[i].getType()==PokemonType.FIRE&&p2.getPokemons()[i].getType()==PokemonType.GRASS) win1++;
				else if(p1.getPokemons()[i].getType()==PokemonType.GRASS&&p2.getPokemons()[i].getType()==PokemonType.WATER) win1++;
				else if(p1.getPokemons()[i].getType()==PokemonType.WATER&&p2.getPokemons()[i].getType()==PokemonType.FIRE) win1++;
				else win2++;
			}
			else if(p1.getPokemons()[i].getType()==p2.getPokemons()[i].getType())
			{
				if(p1.getPokemons()[i].getCp()>p2.getPokemons()[i].getCp()) win1++;
				else if(p1.getPokemons()[i].getCp()==p2.getPokemons()[i].getCp())
				{
					int ran=(int)(Math.random()*2);
					if(ran==0) win1++;
					else win2++;
				}
				else win2++;
			}
		}
		
		if(win1>win2){
			p1.setLevel(p1.getLevel()+1);
			System.out.println("Winner is "+p1.getPlayerName()+", and his/her level becomes "+p1.getLevel()+".");
			return p1;
		}
		else{
			p2.setLevel(p2.getLevel()+1);
			System.out.println("Winner is "+p2.getPlayerName()+", and his/her level becomes "+p2.getLevel()+".");
			return p2;
		}
	}

}
