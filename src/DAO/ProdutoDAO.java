
package DAO;

import MODEL.Produto;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    Connection conexao = null;
    PreparedStatement pstm = null;
    
    public void createProduto(Produto produto){
        conexao = new ConnectionFactory().getConexao();
        
        String sql = "INSERT INTO Produto(nome,preco,quantidade,UnidadeMedida) VALUES(?,?,?,?)";
        
        try{
        pstm = conexao.prepareStatement(sql);
        pstm.setString(1, produto.getNome());
        pstm.setDouble(2, produto.getPreco());          
        pstm.setInt(3, produto.getQuantidade());
        pstm.setString(4,produto.getUmedida());
        pstm.execute();
        pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Exceção:" +e);
        }
        
    }
    
}
