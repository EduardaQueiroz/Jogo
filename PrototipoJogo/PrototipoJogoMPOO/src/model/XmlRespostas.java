package model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;

public class XmlRespostas {
	
	private List<RespostaJogador> respostasJogadores;
	private File file;
	private XStream xStream;
	
	public XmlRespostas() {
		respostasJogadores = new ArrayList<>();
		
		xStream = new XStream(new Dom4JDriver());
		xStream.alias("RespostaJogador", RespostaJogador.class);
		
		file = new File("src/txts/respostasJogadores.xml");
	}
	
	public void salvar(RespostaJogador resposta) {
		respostasJogadores.add(resposta);
		
		try {
			if (!file.exists())
				file.createNewFile();
			else {
				file.delete();
				file.createNewFile();
			}
				
			OutputStream stream = new FileOutputStream(file);
			xStream.toXML(respostasJogadores, stream);
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<RespostaJogador> ler(){
		try {
			if (!file.exists())
				file.createNewFile();
			else {
				return (ArrayList<RespostaJogador>) xStream.fromXML(file);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

		return null;
		
	}

	public List<RespostaJogador> getRespostasJogadores() {
		return respostasJogadores;
	}

	public void setRespostasJogadores(List<RespostaJogador> respostasJogadores) {
		this.respostasJogadores = respostasJogadores;
	}

}
