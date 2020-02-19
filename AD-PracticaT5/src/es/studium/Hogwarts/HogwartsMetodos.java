package es.studium.Hogwarts;

import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;

public class HogwartsMetodos {
	
	static MongoClient conexion =  MongoClients.create("mongodb://localhost:27017");
	static MongoDatabase database =  conexion.getDatabase("harry");
	static MongoCollection<Document> personajes = database.getCollection("character");
	
	public static void mostrarHumanos(){
		FindIterable<Document> busquedaHumanos = personajes.find(eq("species", "human"));
		
		for (Object personajes : busquedaHumanos) {
			System.out.println(((Document) personajes).toJson());
		}
	}
	
	public static void mostrarNacidosAntes1979(){
		FindIterable<Document> busquedaNacimientos = personajes.find(lt("yearOfBirth", 1979));
		
		for (Object personajes : busquedaNacimientos) {
			System.out.println(((Document) personajes).toJson());
		}
		
	}
	
	public static void mostrarVaritasAcebo(){
		FindIterable<Document> busquedaVaritas = personajes.find(eq("wand.wood", "holly"));
		
		for (Object personajes : busquedaVaritas) {
			System.out.println(((Document) personajes).toJson());
		}
	}
	
	public static void mostrarEstudiantesVivos(){
		FindIterable<Document> busquedaEstudiantes = personajes.find(and(eq("alive", true),eq("hogwartsStudent",true)));
		
		for (Object personajes : busquedaEstudiantes) {
			System.out.println(((Document) personajes).toJson());
		}
	}
	
}
