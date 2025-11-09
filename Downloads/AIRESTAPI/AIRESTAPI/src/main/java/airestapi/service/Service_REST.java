package airestapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import airestapi.entity.data;
import airestapi.entity.description;
import airestapi.entity.response;

@Service

public class Service_REST {
	
	
	private List<response> list = new ArrayList<>() ; 
//	int status , data data , description desc
	
	public Service_REST() {
//		list.add(new response(1, new data("PHP","1995","7.3.11", "RutviRaj") , new description(".php", "weak", "PHP License (most of Zend engine\\r\\n\\t\\t\\tunder Zend Engine License"))) ;
		
		list.add(new response(1, new data("PHP","1995","7.3.11", "RutviRaj") , new description(".php", "weak", "PHP License (most of Zend engine\\r\\n\\t\\t\\tunder Zend Engine License"))) ;
		list.add(new response(2, new data("Java","1995","21.0.1", "James Gosling") , new description(".java", "strong", "GPLv2 with Classpath Exception"))) ;
		list.add(new response(3, new data("Python","1991","3.12.0", "Guido van Rossum") , new description(".py", "dynamic", "Python Software Foundation License (PSF)")) );
		list.add(new response(4, new data("JavaScript","1995","ECMA-262", "Brendan Eich") , new description(".js", "weak", "MIT License")) );
		list.add(new response(5, new data("C++","1983","C++23", "Bjarne Stroustrup") , new description(".cpp", "strong", "Proprietary/Various")) );
		list.add(new response(6, new data("C#","2000","12.0", "Anders Hejlsberg") , new description(".cs", "strong", "MIT License")) );
		list.add(new response(7, new data("Ruby","1995","3.2.2", "Yukihiro Matsumoto") , new description(".rb", "dynamic", "Ruby License")) );
		list.add(new response(8, new data("Swift","2014","5.9.0", "Chris Lattner") , new description(".swift", "strong", "Apache 2.0")) );
		list.add(new response(9, new data("Go","2009","1.21.3", "Robert Griesemer") , new description(".go", "strong", "BSD License")) );
		list.add(new response(10, new data("Kotlin","2011","1.9.20", "JetBrains Team") , new description(".kt", "strong", "Apache 2.0")) );
		list.add(new response(11, new data("TypeScript","2012","5.2.2", "Microsoft Team") , new description(".ts", "strong", "Apache 2.0")) );
		list.add(new response(12, new data("Rust","2010","1.73.0", "Graydon Hoare") , new description(".rs", "strong", "MIT/Apache 2.0")) );
		list.add(new response(13, new data("R","1993","4.3.1", "Ross Ihaka") , new description(".R", "statistical", "GPL")) );
		list.add(new response(14, new data("Scala","2003","3.3.1", "Martin Odersky") , new description(".scala", "strong", "Apache 2.0")) );
		list.add(new response(15, new data("Haskell","1990","9.6.1", "Simon Peyton Jones") , new description(".hs", "pure", "BSD3")) );
		list.add(new response(16, new data("Perl","1987","5.38.0", "Larry Wall") , new description(".pl", "weak", "Artistic License 2.0")) );
		list.add(new response(17, new data("Lua","1993","5.4.6", "Roberto Ierusalimschy") , new description(".lua", "weak", "MIT License")) );
		list.add(new response(18, new data("Matlab","1984","R2023b", "Cleve Moler") , new description(".m", "numerical", "Proprietary")) );
		list.add(new response(19, new data("SQL","1974","SQL:2023", "Donald D. Chamberlin") , new description(".sql", "query", "Various")) );
		list.add(new response(20, new data("Scheme","1975","R7RS", "Guy L. Steele Jr.") , new description(".scm", "functional", "BSD/MIT")) );
		list.add(new response(21, new data("Dart","2011","3.1.5", "Lars Bak") , new description(".dart", "strong", "BSD 3-Clause")) );
		list.add(new response(22, new data("Objective-C","1984","2.0", "Brad Cox") , new description(".m", "strong", "GNU GPL/LGPL")) );
		list.add(new response(23, new data("Prolog","1972","ISO 13211", "Alain Colmerauer") , new description(".pl", "logic", "Various")) );
		list.add(new response(24, new data("Fortran","1957","Fortran 2023", "John Backus") , new description(".f90", "strong", "Various")) );
		list.add(new response(25, new data("Lisp","1958","Common Lisp", "John McCarthy") , new description(".lisp", "functional", "Various")) );
		list.add(new response(26, new data("Cobol","1959","ISO/IEC 1989", "CODASYL") , new description(".cbl", "legacy", "Various")) );
		list.add(new response(27, new data("Ada","1980","Ada 2022", "Jean Ichbiah") , new description(".ada", "strong", "Various")) );
		list.add(new response(28, new data("Pascal","1970","ISO 7185", "Niklaus Wirth") , new description(".pas", "strong", "Various")) );
		list.add(new response(29, new data("Delphi","1995","12 Athens", "Anders Hejlsberg") , new description(".dpr", "strong", "Proprietary")) );
		list.add(new response(30, new data("Assembly","1949","N/A", "Kathleen Booth") , new description(".asm", "low-level", "N/A")) );
		list.add(new response(31, new data("VBA","1993","7.1", "Microsoft Team") , new description(".vba", "weak", "Proprietary")) );
		list.add(new response(32, new data("Groovy","2003","4.0.15", "James Strachan") , new description(".groovy", "dynamic", "Apache 2.0")) );
		list.add(new response(33, new data("Elixir","2010","1.15.7", "José Valim") , new description(".ex", "functional", "MIT License")) );
		list.add(new response(34, new data("Clojure","2007","1.11.1", "Rich Hickey") , new description(".clj", "functional", "EPL 1.0")) );
		list.add(new response(35, new data("Erlang","1986","26.1.2", "Joe Armstrong") , new description(".erl", "functional", "Apache 2.0")) );
		list.add(new response(36, new data("F#","2005","8.0", "Don Syme") , new description(".fs", "strong", "Apache 2.0")) );
		list.add(new response(37, new data("Julia","2012","1.9.3", "Jeff Bezanson") , new description(".jl", "dynamic", "MIT License")) );
		list.add(new response(38, new data("Smalltalk","1972","ANSI Smalltalk", "Alan Kay") , new description(".st", "pure-oo", "Various")) );
		list.add(new response(39, new data("ActionScript","2000","3.0", "Macromedia") , new description(".as", "weak", "Proprietary")) );
		list.add(new response(40, new data("Powershell","2006","7.4.0", "Jeffrey Snover") , new description(".ps1", "scripting", "MIT License")) );
		list.add(new response(41, new data("Zsh","1990","5.9", "Paul Falstad") , new description(".zsh", "shell", "MIT License")) );
		list.add(new response(42, new data("Ksh","1983","93u+", "David Korn") , new description(".sh", "shell", "EPL 1.0")) );
		list.add(new response(43, new data("VHDL","1987","IEEE 1076", "DoD/IEEE") , new description(".vhd", "hardware", "Various")) );
		list.add(new response(44, new data("Verilog","1984","IEEE 1364", "Phil Moorby") , new description(".v", "hardware", "Various")) );
		list.add(new response(45, new data("Awk","1977","Gawk 5.2.2", "Alfred Aho") , new description(".awk", "text-proc", "GPLv3")) );
		list.add(new response(46, new data("Sed","1974","4.9", "Lee E. McMahon") , new description(".sed", "text-proc", "Various")) );
		list.add(new response(47, new data("Rexx","1979","Open Object Rexx", "Mike Cowlishaw") , new description(".rexx", "scripting", "EPL 1.0")) );
		list.add(new response(48, new data("Nim","2008","2.0.0", "Andreas Rumpf") , new description(".nim", "strong", "MIT License")) );
		list.add(new response(49, new data("Crystal","2014","1.9.2", "Ary Borenszweig") , new description(".cr", "strong", "MIT License")) );
		list.add(new response(50, new data("D","2001","2.105.0", "Walter Bright") , new description(".d", "strong", "Boost License")) );
		
	}
	
	


	public List<response> getAll() {
		return list ;
	}
	
	public ResponseEntity<response >getOneRes(int id ) {
		
		// check id 
		List<response> match = checkIfPresent(id) ;
		
		if (match.size()<1) {
			return ResponseEntity.notFound().build() ;
		}
		
		
		return ResponseEntity.ok(match.getFirst());
		
	}
	
	public ResponseEntity<response> postEntry(response res) {
		List<response> match = checkIfPresent(res.getStatus()) ;
		
		if (match.size()>0) {
			return ResponseEntity.badRequest().build() ;
		}
		
		list.add(res) ;
	
		return ResponseEntity.ok(res);
		
	}
	
	private List<response> checkIfPresent(int id) {
		
		List<response> match = list.stream()
		.filter(obj -> obj.getStatus() == id).collect(Collectors.toList()) ;
		
		return match ;
		
	}
	
	
	
}
