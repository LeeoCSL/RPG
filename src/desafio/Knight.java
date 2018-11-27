package desafio;

public class Knight extends Character{
	WeaponBehaviour weapon;
	String nome = "Knight";
	
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
