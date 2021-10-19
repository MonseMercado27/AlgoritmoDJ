/**
 * @author: Ing. Noé Vásquez Godínez
 * @email: noe-vg@outlook.com
 * @about: Clase para implementar Dijkstra's algorithm
 */
class AlgoritmoDJ{
    /**
     * @about:
     * En este metodo se iniciara sel setup del algoritmo
     */
    public void init(){
        this.start();
        public class Dijkstra
{
 public  int distance[] = new int[10];
 public  int cost[][] = new int[10][10];
 
 public void calc(int n,int s)
 {
  int flag[] = new int[n+1];
  int i,minp=1,k,c,minim;
  
  for(i=1;i<=n;i++)
  {  
      flag[i]=0; 
      this.distance[i]=this.cost[s][i]; 
  }
  c=2;
  while(c<=n)
  {
   minimum=99;
   for(k=1;k<=n;k++)
   { 
          if(this.distance[k]<minim && flag[k]!=1)
       {
        minim=this.distance[i];
        minp=k;
       }
      } 
            flag[minp]=1;
      c++;
      for(k=1;k<=n;k++){
       if(this.distance[minp]+this.cost[minp][k] <  this.distance[k] && flag[k]!=1 )
       this.distance[k]=this.distance[minp]+this.cost[minp][k];
   }   
  } 
  
 }
    }
    /**@about: 
     * En este metodo se incia el algoritmo
     */
    private void start(){
        System.out.println("[OK] starting . . .");
        
        Gui guiInterface = new Gui();
        guiInterface.setVisible(true);
    
    } 
    public static void main(String[] args) {
        AlgoritmoDJ algoritmoDJ = new AlgoritmoDJ();
        algoritmoDJ.init();
    }
}