package com.dogussaglam;

import com.dogussaglam.Mahalle._33_Il._33_Ilce._33_Mahalle;

// static olan inner class
// Ulke Il Ilçe Mahalle

public class Mahalle {
	
	// İç static olan class (ülke)
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// İç static olan class (İl)
	public static class _33_Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// İç static olan class (İlçe)
		public static class _33_Ilce {
			private String ilceAdi;
			
			public String getIlceAdi() {
				return ilceAdi;
			}
			
			public void setIlceAdi(String ilceAdi) {
				this.ilceAdi = ilceAdi;
			}
			
			public static class _33_Mahalle {
				private String mahalleAdi;
				
				public String getMahalleAdi() {
					return mahalleAdi;
				}
				
				public void setMahalleAdi(String mahalleAdi) {
					this.mahalleAdi = mahalleAdi;
				}
			}
			
		}
		
		// main test
		public static void main(String[] args) {
			Mahalle ulke = new com.dogussaglam.Mahalle();
			ulke.setUlkeAdi("Turkey");
			
			_33_Il il = new _33_Il();
			il.setIlAdi("Kocaeli");
			
			_33_Ilce ilce = new _33_Ilce();
			ilce.setIlceAdi("Izmit");
			
			_33_Mahalle mahalle = new _33_Mahalle();
			mahalle.setMahalleAdi("Tavsantepe");
			
			System.out.println("Country name: " + ulke.getUlkeAdi() + " Ctiy name: " + il.getIlAdi()
					+ " District name: " + ilce.getIlceAdi() + " Neighbourhood name: " + mahalle.getMahalleAdi());
		}
	}
}
