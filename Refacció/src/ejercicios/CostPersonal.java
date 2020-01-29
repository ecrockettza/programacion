package ejercicios;
 
import java.util.ArrayList;
import java.util.Collection;
 
 
public class CostPersonal {
 
static float CostDelTreballador(Treballador treballadors){
 
if (treballadors.getTipusTreballador() == treballadors.DIRECTOR || treballadors.getTipusTreballador() == treballadors.SUBDIRECTOR ) {
return treballadors.getNomina();
}
else
{
return treballadors.getNomina() + (treballadors.getHoresExtres() * 20);
}
 
}
float CostDelPersonal(Treballador treballadors[]) {
float costFinal = 0;
Treballador treballador;
for (int i = 0; i < treballadors.length; i++) {
costFinal = costFinal + CostTreballador(treballadors[i]);
}
return costFinal;
}
}
