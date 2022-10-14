import java.util.Scanner;

// PROGRAM 20
public class Mix {
	String wrd;
	int len;

	Mix() {
		wrd = "";
		len = 0;
	}

	void feedword() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word: ");
		wrd = sc.next().toUpperCase();
		len = wrd.length();
	}

	void mix_word(Mix P,Mix Q) {
		int morelen = Math.max(P.len, Q.len);
		for (int i = 0; i < morelen; i++) {
			if (i < P.len) {
				this.wrd += P.wrd.charAt(i);
			}
			if (i < Q.len) {
				this.wrd += Q.wrd.charAt(i);
			}
		}
		this.len = this.wrd.length();
	}

	void display() {
		System.out.println("Mixed word: " + this.wrd);
	}

	public static void main(String[] args) {
		Mix m1 = new Mix();
		Mix m2 = new Mix();
		Mix m3 = new Mix();
		m1.feedword();
		m2.feedword();
		m3.mix_word(m1, m2);
		m3.display();
	}
}
