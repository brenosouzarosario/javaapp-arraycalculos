package View;

public class frm_ArrayCalculos extends javax.swing.JFrame {

    public frm_ArrayCalculos() {
        initComponents();
    }
    int[] vetor = new int[10];
    int numElementos = 1;
    int numero = 0;
    int numPar = 0;
    int ct = 0;
    String numeroString = "";
    String valorString = "";

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEntradaDados = new javax.swing.JTextField();
        txtVetorImpar = new javax.swing.JTextField();
        txtVetorInvertido = new javax.swing.JTextField();
        txtQtPares = new javax.swing.JTextField();
        txtNoElementos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Array Cálculos");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Exemplo Entrada de Dados: 2/35/6/8/9/...99");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Entrada Dados:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Vetor só ímpar:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Vetor invertido:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Qt.No.Pares:");

        btnCalcular.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("No.Elementos:");

        txtVetorImpar.setEnabled(false);

        txtVetorInvertido.setEnabled(false);

        txtQtPares.setEnabled(false);

        txtNoElementos.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEntradaDados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtVetorImpar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVetorInvertido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtQtPares, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(txtNoElementos, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)))
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntradaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVetorImpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVetorInvertido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQtPares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNoElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnCalcular)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        vetor[9] = 99;
        for (int ct = 0; ct <= 8; ct++) {
            vetor[ct] = 0;
        }
        int comprimento = this.txtEntradaDados.getText().length();
        for (ct = 0; ct < comprimento; ct++) {
            if (ct != comprimento) {
                valorString = this.txtEntradaDados.getText().substring(ct, ct + 1);
                if (valorString != "/") {
                    numeroString = numeroString + valorString;
                } else {
                    numero = Integer.valueOf(numeroString);
                    vetor[numElementos] = numero;
                    numElementos++;
                    numeroString = "";
                }

            } else {
                numero = Integer.valueOf(numeroString);
                vetor[numElementos] = numero;
            }
        }
        numElementos++;
        vetor[numElementos] = 99;

        String vetorSoImpar = "";
        for (ct = 0; ct < numElementos + 1; ct++) {
            if ((vetor[ct] % 2) != 0) {
                vetorSoImpar = vetorSoImpar + String.valueOf(vetor[ct]) + "-";

            } else {
                vetorSoImpar = vetorSoImpar + "0" + "-";
                numPar++;
            }
        }
        this.txtVetorImpar.setText(vetorSoImpar);

        String vetorInvertido = "";
        for (ct = numElementos - 1; ct >= 0; ct--) {
            vetorInvertido = vetorInvertido + String.valueOf(vetor[ct]) + "-";
        }
        this.txtVetorInvertido.setText(vetorInvertido);
        this.txtQtPares.setText(String.valueOf(numPar));
        this.txtNoElementos.setText(String.valueOf(numElementos));

        /*for (int ct = 0; ct <= 8; ct++) {
            vetorString = this.txtEntradaDados.getText();
            vetor = vetorString.split("/");
            vetorString = vetor[ct];
            
            if (vetor[ct] != 0) {
                noElementos++;
            }
            if (Integer.valueOf(vetor[ct]) % 2 == 0) {
                qtPares++;
            }
            this.txtVetorImpar.setText(vetor[ct]);
        }
        for (int ct = 8; ct >= 0; ct--) {
            
        }
        
        this.txtNoElementos.setText(String.valueOf(noElementos));
        this.txtQtPares.setText(String.valueOf(qtPares));
         */
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ArrayCalculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtEntradaDados;
    private javax.swing.JTextField txtNoElementos;
    private javax.swing.JTextField txtQtPares;
    private javax.swing.JTextField txtVetorImpar;
    private javax.swing.JTextField txtVetorInvertido;
    // End of variables declaration//GEN-END:variables
}
