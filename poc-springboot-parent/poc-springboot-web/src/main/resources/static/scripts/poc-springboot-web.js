/**
 * 
 */

//Initialisation des fonctions custom
$(document).ready(function () {
    console.log('init');
    
    $("#valider").click(function() {
    	var simulations = JSON.parse($("#simulations").val());
    	var montant = $("montant").val();
    	var duree = $("duree").val();
    	
//    	TODO : parcourir le tableau, et comparer pour chaque élément le montant et la durée. Si on trouve le bon on affiche ses infos à droite
    });
});