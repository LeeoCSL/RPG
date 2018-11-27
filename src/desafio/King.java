package desafio;

public class King extends Character{
	WeaponBehaviour weapon;
	String nome = "Arlequim";
	
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
