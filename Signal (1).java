
package signal;


class Simulation
{
    int n,s,e,w;
    boolean signalChange;
    int signal;
    int SECONDS=20;
    ///default construcot for the class
    public Simulation()
    {
        signal=0;///o for n,s road and 1 for e,w road
        n=s=e=w=0;
        signalChange=false;
    }
    
    void startSimulation()
    {
        int i=0;
        /// starts with green signal on N,S side
        while(i<SECONDS)
        {
            if(i==0)
            {
                 System.out.println(i+" N:"+n+";S="+s+";E:"+e+";W="+w);
                 i++;
                 continue;
            }
            if(signal==0)
            {
                ///if signal chagne
                if(signalChange)
                {
                    for(int j=0;j<2;j++)
                    {
                        n++;s++;
                        e++;w++;
                        System.out.println(i+" N:"+n+";S="+s+";E:"+e+";W="+w);
                        i++;
                        
                        
                        if(i==SECONDS)
                            System.exit(0);
                    }
                    
                    for(int j=0;j<2;j++)
                    {
                       // n++;s++;
                        e++;w++;
                        System.out.println(i+" N:"+n+";S="+s+";E:"+e+";W="+w);
                        i++;
                        
                        
                        if(i==SECONDS)
                            System.exit(0);
                    }
                    signal=1;
                    continue;
                   
                }
                else
                {
                    for(int j=0;j<3;j++)
                    {
                       // n++;s++;
                        e++;w++;
                        System.out.println(i+" N:"+n+";S="+s+";E:"+e+";W="+w);
                        i++;
                        
                        
                        if(i==SECONDS)
                            System.exit(0);
                        
                       
                    }
                    signalChange=true;
                    signal=1;
                  continue;
                }
               
            }
            else if(signal==1)
            {
                if(signalChange)
                {
                    for(int j=0;j<2;j++)
                    {
                        n++;s++;
                        e++;w++;
                        System.out.println(i+" N:"+n+";S="+s+";E:"+e+";W="+w);
                        i++;
                        
                        
                        if(i==SECONDS)
                            System.exit(0);
                    }
                    
                    for(int j=0;j<2;j++)
                    {
                        n++;s++;
                        //e++;w++;
                        System.out.println(i+" N:"+n+";S="+s+";E:"+e+";W="+w);
                        i++;
                        
                        
                        if(i==SECONDS)
                            System.exit(0);
                    }
                    signal=0;
                    continue;
                   
                }
                
            
            }
            i++;
            
        }
        
    }

}

public class Signal {

    public static void main(String[] args) 
    {
        Simulation ob=new Simulation();
        ob.startSimulation();
        
    }
    
}
