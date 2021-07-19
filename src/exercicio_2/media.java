package exercicio_2;

public class media {

	float n1, n2, n3, n4, media;

	public void setNotas(float a, float b, float c, float d) {

		n1 = a;
		n2 = b;
		n3 = c;
		n4 = d;
	}

	public float GetMedia() {
		media = (n1 + n2 + n3 + n4) / 4;
		return media;
	}

}
