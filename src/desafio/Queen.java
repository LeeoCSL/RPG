package desafio;

public class Queen extends Character{
	WeaponBehaviour weapon;
	String nome = "Queen";
	
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
