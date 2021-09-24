# Interfaces Listener
Para lograr entender las interfaces listener debemos anteriormente saber **¿qué es un evento?**
Los eventos son acciones que aplicas en el programa, Por ejemplo:
* Arrastrar, Mover, Pulsar un botón, icono
* Escribir en una caja de texto
Cuando sucede un evento se da inicio a un grupo de acciones programadas por el usuario para que suceda ese evento.
![ImagenDeProgramacion](https://player.slideplayer.es/2/160347/data/images/img6.jpg)
## ¿Qué son las interfaces de escucha?
Representa aquellas interfaces responsables de manejar eventos, Por ejemplo: Para la clase ActionEvent tendríamos ActionListener, Especifica un método para tratar los eventos en AccionEvent.
Entre las interfaces podemos hallar métodos de respuesta a los eventos, Cada interfaz de escucha contiene métodos para gestionar un grupo de eventos.
## Interfaces de escucha y sus métodos
* ContainerListener: Notifican solamente, No escucha envase necesita estar presente para los componentes que se agregan o se quitan con éxito, Sus métodos son:
1.-componentAddes _ComponentEvent_
2.-componentRemoved _ComponentEvent_
* AdjustmentListener: Escucha eventos tipo AdjustmentEvent generados por la clase JScrollbar, Sus métodos:
1.- adjustmentValueChanged _AdjustmentEvent_
* ActionListener: Se utiliza para manejar y detectar eventos de acción, Sus métodos:
1.- actionPerformed _actionEvent_
* MouseListener: permite eventos producidos por el ratón, Sus métodos: 
1.- mouseClicked _MouseEvent_
2.- mouseEntered _MouseEvent_
3.- mouseExcited _MouseEvent_
4.- mousePressed _MouseEvent_
5.- mouseReleased _MouseEvent_
* ItemListener: Sus métodos: 
1.- itemStateChanged _ItemEvent_
* ComponentListener: Sirve para marcar un objeto con la capacidad de escuchar eventos de tipo ComponentEvent, Sus métodos:
1.- componentHidden _ComponentEvent_ 
2.- componentMoved _ComponentEvent_
3.- componentResized _ComponentEvent_
4.- componentShown _ComponentEvent_
* KeyListener: Logra detectar y tratar los eventos generados por una pulsación de una tecla o más, Sus métodos: 
1.- keyPressed _KeyEvent_
2.- keyReleased _KeyEvent_
3.- keyTyped _KeyEvent_
* FocusListener: Cuando un componente recibe el elemento de la pantalla que está activo produce eventos de tipo FocusEvent, Sus métodos: 
1.- focusGained _FocusEvent_
2.- focusLost _FocusEvent_