/**
 * A questão refere-se a criar um método estático em uma classe pública,
 * no entanto essa foi uma forma que encontrei para usar um método
 * que pode ser reaproveitado em várias partes do código
 * 
 * @name Utils
 * @author Ack Lay (cleidimarviana@gmail.com)
 * 
 * Questão: http://pt.stackoverflow.com/questions/182951/
 * */
import { Injectable } from '@angular/core';
import { ToastController } from 'ionic-angular';

@Injectable()
export class Utils {
  constructor(public toastCtrl: ToastController) { 

  }
  /**
  * Este metodo mostra um Toast para o usuário passando como parametro
  * a mensagem e a posição no qual o usuário quer que o toast apareça
  *
  * @param message 
  * @param pos
  */
  showToast(message, pos) {
    let toast = this.toastCtrl.create({
      message: message,
      duration: 3000,
      position: pos
    });

    toast.onDidDismiss(() => {
      console.log('Dismissed toast');
    });

    toast.present();
  }
}
