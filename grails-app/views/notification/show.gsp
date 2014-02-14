<html>
  <head>
  </head>
  <body>
   <div id="forms">
     <g:formRemote name="createNotification" update="listNotification" url="[controller: 'notification', action: 'notificationSend']" >
       Escribe los mail a los que deseas enviar la notificacion : <input type="text" name="to" id="to" /> 
       <p>&nbsp</p>
       Escriba el mail de donde desea que salgan las notificaciones : <input type="text" name="sender" id="sender" />
       <p>&nbsp</p>
       Escriba el asunto que desea <input type="text" name="subject" id="subject" />
       <p>&nbsp</p>
       Escriba el cuerpo del mail <g:textArea name="body" id="body" style="overflow:auto;resize:none"  rows="10" cols="100" />
       <p>&nbsp</p>
       <button type="submit"> submit </button> 
     </g:formRemote> 
   </div>
   <div id="listNotification">
   </div>
  </body>
</html>
