package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.Getter;
//import lombok.Setter; // sadece getter veya setter istiyorsak
// Veritabanındaki tabloyu bir class olarak temsil ettim.

@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
	@Id // Id veritabanında primary key'dir deriz.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Sürekli veritabanına farklı sistemlerden gelen datalar
	// olduğunda Id'yi veritabanında otomatik olarak artırsın diye bu ifadeyi yazdık.
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	
// Brand -- id,name,quantity
// GetAllBrandsResponse -- id,name 
// Brand nesnesindeki her bilgiyi son kullanıcıya göstermek istemiyorum.
// Bu yuzden request'e donucek cevabı veren GetAllBrandsResponse'a listedeki tüm id ve name'leri GetAllBrandsResponse
// a atarım. Kullanıcı 3 bilgiden 2 sini görür. Buna mapping deniyor.
	

}
