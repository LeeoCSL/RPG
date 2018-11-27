package desafio;

public class Troll extends Character{
	WeaponBehaviour weapon;
	String nome = "troll";
	
	void fight() {
		weapon.useWeapon();
	}
	
	void setWeapon(WeaponBehaviour weapon) {
		this.weapon = weapon;
	}
	
	public String getNome() {
		return nome;
	}
}
