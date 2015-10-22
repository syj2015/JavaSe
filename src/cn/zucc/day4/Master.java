package cn.zucc.day4;

public class Master {
	public void Cure(Pet pet) {
		pet.cure();
	}
	public void Eat(Pet pet){
		pet.eat();
	}

	public void wan(Pet pet) {
		if (pet instanceof Dog) {
			((Dog) pet).catchingFlyDisc();
		} else if (pet instanceof Penguin) {
			Penguin pgn = (Penguin) pet;
			pgn.swimming();
		}
	}

}