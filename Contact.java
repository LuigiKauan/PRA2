/*
desenvolvido por Luigi Kauan Paixão Minel.
Número 19. INF2EM
*/
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
//Acima temos as importações

@Entity
@Entity(tableName = "contacts")//criação da entidade

public class Contacts{
	
	@PrimaryKey(autoGenerate = true)
	@NonNull
	@ColumnInfo(name = "contactsId")
	private int mId; //identificador único

	@Nullable
	@ColumnInfo(name = "contactsCreationDate")
	private String mCreationDate;//data de controle para o BD
	
	
	@Nullable
	@ColumnInfo(name = "contactsName")
	private String mName; //nome do contato

	@Nullable
	@ColumnInfo(name = "contactsLocation")
	private String mLocation; 

	@Nullable
	@ColumnInfo(name = "contactsRanking")
	private int mRanking; //nota do contato de 0 à 10
	 
	
    //Acima criei todas as colunas da classe Contacts
	
	public Contacts(@Nullable String creationdate, String name, int ranking, String location) {
    mCreationDate = creationdate;
    mName = name;
    mLocation = location;
    mRanking = ranking;
	}
    
	//Gerando getters and setters
	
	public int getId() {
		return mId;
	}

	public void setId(int mId) {
		mId = Id;
	}

	public String getCreationDate() {
		return mCreationDate;
	}

	public void setmCreationDate(String CreationDate) {
		mCreationDate = CreationDate;
	}

	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		mName = Name;
	}

	public String getLocation() {
		return mLocation;
	}

	public void setLocation(String mLocation) {
		mLocation = Location;
	}

	public int getScore() {
		return mRanking;
	}

	public void setRanking(int mRanking) {
		mRanking = Ranking;
	}
  //private int mRanking
  //private int mCreationDate

}
