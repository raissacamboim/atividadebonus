/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class TelaDaLista extends javax.swing.JFrame {

    private static void btordenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private final TelaDaLista LitarNumerosinteiros;
    private final TelaDaLista ListaDeNumeros;

    /**
     * Creates new form TelaDaLista
     */
    public TelaDaLista() {
        this.ListarNumerosInteiros = new TelaDaLista(){
            
            private void btlistarActionPerformed(java.awt.event.ActionEvent evt) {
                btlistar.setText("LISTAR");
                btlistar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ListaDeNumerosActionPerformed(evt);
                    }
                    
                    private void ListaDeNumerosActionPerformed(ActionEvent evt) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
            }
            
            private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {
                btsalvar.setText("SALVAR");
                btsalvar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btsalvarActionPerformed(evt);
                    }
                });
                
            }
            
            private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {
                btbuscar.setText("BUSCAR NÚMERO");
                btbuscar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btbuscarActionPerformed(evt);
                    }
                });
            }
            
            private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {
                btlimpar.setText("LIMPAR");
                btlimpar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btlimparActionPerformed(evt);
                    }
                });
            }
            
            private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {
                btexcluir.setText("EXCLUIR");
                btexcluir.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btexcluirActionPerformed(evt);
                    }
                });
            }
            
            private void btmaximoActionPerformed(java.awt.event.ActionEvent evt) {
                int maximo = listaNumerosInteiros.getMaximo();
                JOptionPane.showMessageDialog(null, "Número Máximo: " + maximo);
                
            }
            
            private void btordenarActionPerformed(java.awt.event.ActionEvent evt) {
                
                TelaDaLista.btordenar();
                btlistar.doClick();
            }
        };
        this.ListaDeNumeros = new TelaDaLista(){
            
            private void btlistarActionPerformed(java.awt.event.ActionEvent evt) {
                btlistar.setText("LISTAR");
                btlistar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ListarNumerosinteirosActionPerformed(evt);
                    }

                    private void ListarNumerosinteirosActionPerformed(ActionEvent evt) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
            }
            
            private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {
                btsalvar.setText("SALVAR");
                btsalvar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btsalvarActionPerformed(evt);
                    }
                });
                
            }
            
            private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {
                btbuscar.setText("BUSCAR NÚMERO");
                btbuscar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btbuscarActionPerformed(evt);
                    }
                });
            }
            
            private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {
                btlimpar.setText("LIMPAR");
                btlimpar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btlimparActionPerformed(evt);
                    }
                });
            }
            
            private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {
                btexcluir.setText("EXCLUIR");
                btexcluir.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btexcluirActionPerformed(evt);
                    }
                });
            }
            
            private void btmaximoActionPerformed(java.awt.event.ActionEvent evt) {
                int maximo = 0;
                maximo = maximo;
                JOptionPane.showMessageDialog(null, "Número Máximo: " + maximo);
                
            }
            
            private void btordenarActionPerformed(java.awt.event.ActionEvent evt) {
                
                TelaDaLista.btordenar();
                btlistar.doClick();
                
            }
            
            
        };
        this.LitarNumerosinteiros = new TelaDaLista(){
            
            private void btlistarActionPerformed(java.awt.event.ActionEvent evt) {
                btlistar.setText("LISTAR");
                btlistar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btlistarnumerosActionPerformed(evt);
                    }

                    private void btlistarnumerosActionPerformed(ActionEvent evt) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
            }
            
            private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {
                btsalvar.setText("SALVAR");
                btsalvar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btsalvarActionPerformed(evt);
                    }
                });
                
            }
            
            private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {
                btbuscar.setText("BUSCAR NÚMERO");
                btbuscar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btbuscarActionPerformed(evt);
                    }
                });
            }
            
            private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {
                btlimpar.setText("LIMPAR");
                btlimpar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btlimparActionPerformed(evt);
                    }
                });
            }
            
            private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {
                btexcluir.setText("EXCLUIR");
                btexcluir.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btexcluirActionPerformed(evt);
                    }
                });
            }
            
            private void btmaximoActionPerformed(java.awt.event.ActionEvent evt) {
                
            }
            
            private void btordenarActionPerformed(java.awt.event.ActionEvent evt) {
                
                TelaDaLista.btordenar();
                btlistar.doClick();
                
            }
            
        };
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbAdicionarNumero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btlistar = new javax.swing.JButton();
        btlistarpares = new javax.swing.JButton();
        btlistarimpares = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbinforme = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lbnovonumero = new javax.swing.JLabel();
        edNumeroNovo = new javax.swing.JTextField();
        btalterar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btmaximo = new javax.swing.JButton();
        btmedia = new javax.swing.JButton();
        btminimo = new javax.swing.JButton();
        btordenar = new javax.swing.JButton();
        btatualizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbinformeocodigo = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btexcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTitulo.setText("Lista de Números");

        lbAdicionarNumero.setText("ADICIONAR NÚMERO");

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btlistar.setBackground(new java.awt.Color(255, 255, 204));
        btlistar.setText("Listar");
        btlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlistarActionPerformed(evt);
            }
        });

        btlistarpares.setBackground(new java.awt.Color(204, 204, 255));
        btlistarpares.setText("Listar Pares");
        btlistarpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlistarparesActionPerformed(evt);
            }
        });

        btlistarimpares.setBackground(new java.awt.Color(204, 204, 255));
        btlistarimpares.setText("Listar Impares");
        btlistarimpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlistarimparesActionPerformed(evt);
            }
        });

        btsalvar.setBackground(new java.awt.Color(255, 255, 204));
        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        btlimpar.setBackground(new java.awt.Color(255, 255, 204));
        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 0, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ALTERAR"));

        lbinforme.setBackground(new java.awt.Color(255, 255, 255));
        lbinforme.setText("Informe o código");

        lbnovonumero.setText("Novo número");

        btalterar.setText("Alterar");
        btalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbinforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbnovonumero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNumeroNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btalterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbinforme)
                    .addComponent(lbnovonumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNumeroNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btalterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 0, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR NÚMERO"));

        btbuscar.setText("Buscar");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite o número");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbuscar))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btbuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 0, 204));

        btmaximo.setText("Máximo");
        btmaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmaximoActionPerformed(evt);
            }
        });

        btmedia.setText("Média");
        btmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmediaActionPerformed(evt);
            }
        });

        btminimo.setText("Mínimo");
        btminimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btminimoActionPerformed(evt);
            }
        });

        btordenar.setText("Ordenar");
        btordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btordenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btmaximo)
                        .addGap(18, 18, 18)
                        .addComponent(btminimo))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btmedia)
                        .addGap(18, 18, 18)
                        .addComponent(btordenar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmaximo)
                    .addComponent(btminimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmedia)
                    .addComponent(btordenar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btatualizar.setBackground(new java.awt.Color(255, 255, 153));
        btatualizar.setText("Atualizar");
        btatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btatualizarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 0, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("EXCLUIR"));

        lbinformeocodigo.setForeground(new java.awt.Color(255, 255, 255));
        lbinformeocodigo.setText("Informe o código");

        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btexcluir))
                    .addComponent(lbinformeocodigo)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbinformeocodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btexcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lbAdicionarNumero)
                            .addGap(237, 237, 237))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btlimpar)
                                .addComponent(btsalvar)
                                .addComponent(btlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btlistarimpares)
                                .addComponent(btlistarpares)
                                .addComponent(btatualizar)))))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(26, 26, 26)
                .addComponent(lbAdicionarNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btlimpar)
                            .addComponent(btatualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btsalvar)
                            .addComponent(btlistarpares))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btlistar)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btlistarimpares)
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     TelaDaLista ListarNumerosInteiros = new TelaDaLista(){
            
    private void btlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlistarActionPerformed
        btlistar.setText("LISTAR");
        btlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDeNumerosActionPerformed(evt);
            }

            private void ListaDeNumerosActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_btlistarActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        btsalvar.setText("SALVAR");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        btsalvarActionPerformed(evt);
        }
            });
       
    }//GEN-LAST:event_btsalvarActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
           btbuscar.setText("BUSCAR NÚMERO");
            btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
      btlimpar.setText("LIMPAR");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
       }); 
    }//GEN-LAST:event_btlimparActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
  btexcluir.setText("EXCLUIR");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });
    }//GEN-LAST:event_btexcluirActionPerformed

    private void btmaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmaximoActionPerformed
     int maximo = listaNumerosInteiros.getMaximo();
    JOptionPane.showMessageDialog(null, "Número Máximo: " + maximo);
         
    }//GEN-LAST:event_btmaximoActionPerformed

    private void btordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btordenarActionPerformed
                                     
        TelaDaLista.btordenar();
        btlistar.doClick();
    }
    }//GEN-LAST:event_btordenarActionPerformed

    private void btmediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmediaActionPerformed
        double media = listaNumerosInteiros.media();
        JOptionPane.showMessageDialog(null, "Média: " + media);

    }//GEN-LAST:event_btmediaActionPerformed

    private void btlistarparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlistarparesActionPerformed
        JOptionPane.showMessageDialog(null, ListarNumerosInteiros.getlistarpares());

    }//GEN-LAST:event_btlistarparesActionPerformed

    private void btlistarimparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlistarimparesActionPerformed
      JOptionPane.showMessageDialog(null, listaNumerosInteiros.getNumerosImpares());
    }//GEN-LAST:event_btlistarimparesActionPerformed

    private void btatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btatualizarActionPerformed
           btatualizar.doClick();
   
    }//GEN-LAST:event_btatualizarActionPerformed

    private void btminimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btminimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btminimoActionPerformed

    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
         ListarNumerosInteiros.alterar(Integer.parseInt(alterar.getText()), Integer.parseInt(edNumeroNovo.getText()));
        btlistar.doClick();
    }//GEN-LAST:event_btalterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDaLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btalterar;
    private javax.swing.JButton btatualizar;
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btlistar;
    private javax.swing.JButton btlistarimpares;
    private javax.swing.JButton btlistarpares;
    private javax.swing.JButton btmaximo;
    private javax.swing.JButton btmedia;
    private javax.swing.JButton btminimo;
    private javax.swing.JButton btordenar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JTextField edNumeroNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lbAdicionarNumero;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbinforme;
    private javax.swing.JLabel lbinformeocodigo;
    private javax.swing.JLabel lbnovonumero;
    // End of variables declaration//GEN-END:variables

    private void alterar(int parseInt, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getlistarpares() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



