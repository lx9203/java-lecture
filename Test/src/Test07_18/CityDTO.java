package Test07_18;

public class CityDTO {
	private int id;
	private String Name;
	private String CountryCode;
	private String District;
	private int Population;

	public CityDTO(int id, String name, String countryCode, String district, int population) {
		this.id = id;
		Name = name;
		CountryCode = countryCode;
		District = district;
		Population = population;
	}

	public CityDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public int getPopulation() {
		return Population;
	}

	public void setPopulation(int population) {
		Population = population;
	}

	@Override
	public String toString() {
		return String.format(" %d %10s %6s %17s  %,d ", id, Name, CountryCode, District, Population);
	}

}