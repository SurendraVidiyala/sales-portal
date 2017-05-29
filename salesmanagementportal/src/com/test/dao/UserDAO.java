package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.test.db.ConnectionFactory;
import com.test.dto.AnnouncementDTO;
import com.test.dto.ClientDTO;
import com.test.dto.ContactsDTO;
import com.test.dto.OpportunityDTO;
import com.test.dto.Project;
import com.test.dto.ProposalDTO;
import com.test.dto.UserDTO;

public class UserDAO {
	
	public static void main(String[] args) {
		UserDAO dao= new UserDAO();
		ProposalDTO dto = new ProposalDTO();
		dto.setProposalName("XYZ");
		dto.setClientId(3);
		dao.addProposal(dto);
	}
	
	public boolean login(String uname, String pwd, int userType)
	{
		boolean flag = false;
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		try {
			ps = conn.prepareStatement("select count(*)  from users  where username=? and password=? and userType=?");
			ps.setString(1, uname);
			ps.setString(2, pwd);
			ps.setInt(3, userType);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				int count = rs.getInt(1);
				System.out.println("No of users: "+count);
				if(count>0)
				{
					flag=true;
				}
				else
				{
					flag=false;
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			flag=false;
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return flag;
	}
	
	public UserDTO getName(String username)
	{
		UserDTO dto = null;
		String name="";
		int userId = -1;
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		try {
			ps = conn.prepareStatement("select userId, name  from users  where username=?");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				dto = new UserDTO();
				userId = rs.getInt(1);
				name = rs.getString(2);
				dto.setUserId(userId);
				dto.setName(name);
				System.out.println("ID, Name: "+userId+", "+name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return dto;
	}
	
	public boolean addUser(UserDTO userDto)
	{
		boolean flag = false;
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		int count = 0;
		
		try
		{
			ps = conn.prepareStatement("insert into users(username, email, userType, name, password) values(?,?,?,?,?)");
			ps.setString(1, userDto.getUsername());
			ps.setString(2, userDto.getEmail());
			ps.setInt(3, userDto.getUserType());
			ps.setString(4, userDto.getName());
			ps.setString(5, userDto.getPassword());
			
			count = ps.executeUpdate();
			
			if(count>0)
				flag=true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			flag=false;
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return flag;
	}
	
	public ArrayList<UserDTO> getUsers()
	{
		ArrayList<UserDTO> al = new ArrayList<UserDTO>();
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		try
		{
			ps = conn.prepareStatement("select * from users where usertype=1");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				UserDTO dto = new UserDTO();
				dto.setUserId(rs.getInt(1));
				dto.setUsername(rs.getString(2));
				dto.setEmail(rs.getString(3));
				dto.setUserType(rs.getInt(4));
				dto.setName(rs.getString(5));
				dto.setPassword(rs.getString(6));
				al.add(dto);
			}
			return al;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return al;
	}
	
	public int createClient(ClientDTO client)
	{
		int flag = 0;
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		int count = 0;
		
		try 
		{
			ps = conn.prepareStatement("insert into clients(companyName, telephone, fax, address, city, state, zip, country, division, industry, website, source, companyDesc, client_type_id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",  Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, client.getCompanyName());
			ps.setString(2, client.getTelephone());
			ps.setString(3, client.getFax());
			ps.setString(4, client.getAddress());
			ps.setString(5, client.getCity());
			ps.setString(6, client.getState());
			ps.setString(7, client.getZip());
			ps.setString(8, client.getCountry());
			ps.setString(9, client.getDivision());
			ps.setString(10, client.getIndustry());
			ps.setString(11, client.getWebsite());
			ps.setString(12, client.getSource());
			ps.setString(13, client.getCompanyDesc());
			ps.setInt(14, client.getClient_type_id());
			
			count = ps.executeUpdate();
			
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next())
			{
				flag=rs.getInt(1);
			}
			
			System.out.println("GENERATED VALUE::: "+flag);
			
			return flag;
		}
		catch (SQLException e) {
			e.printStackTrace();
			flag=0;
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return flag;
	}
	
	
	public void addClientContactDetails(ContactsDTO dto)
	{
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		int count = 0;
		System.out.println("XXXXXX:::"+dto.getClientId());
		try 
		{
			ps = conn.prepareStatement("insert into contacts(clientId, firsr_name, last_name, title, work_phone, mobile_phone, fax, eNews, email) values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, Integer.parseInt(dto.getClientId()));
			ps.setString(2, dto.getFirstName());
			ps.setString(3, dto.getLastName());
			ps.setString(4, dto.getTitle());
			ps.setString(5, dto.getWorkPhone());
			ps.setString(6, dto.getMobilePhone());
			ps.setString(7, dto.getFax());
			ps.setString(8,dto.geteNews());
			ps.setString(9,dto.getEmail());
			count = ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
	}
	
	
	public boolean createClient()
	{
		boolean flag = false;
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		int count = 0;
		
		try 
		{
			ps = conn.prepareStatement("insert into clients values(?,?,?,?,?,?,?,?.?,?,?,?.?,?,?,?,?)");
			ps.setString(1, "");
			ps.setString(2, "");
			ps.setString(3, "");
			ps.setString(4, "");
			ps.setString(5, "");
			ps.setString(6, "");
			ps.setString(7, "");
			ps.setString(8, "");
			ps.setString(9, "");
			ps.setString(10, "");
			ps.setString(11, "");
			ps.setString(12, "");
			ps.setString(13, "");
			ps.setString(14, "");
			ps.setString(15, "");
			ps.setString(16, "");
			
			count = ps.executeUpdate();
			if(count >0)
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
			return flag;
		}
		catch (SQLException e) {
			e.printStackTrace();
			flag=false;
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return flag;
	}
	
	public ArrayList<ClientDTO> searchClients(String companySearchText, String clientType)
	{
		ArrayList<ClientDTO> al = new ArrayList<ClientDTO>();
		String query = "select * from clients";
		
		
		
		if(companySearchText==null || "".equalsIgnoreCase(companySearchText))
		{
			if(clientType==null || "".equalsIgnoreCase(clientType))
			{}
			else
			{
				query = query+" where client_type_id ="+clientType;
			}
		}
		else if(clientType==null || "".equalsIgnoreCase(clientType))
		{
			if(companySearchText==null || "".equalsIgnoreCase(companySearchText))
			{}
			else
			{
				companySearchText =companySearchText.toUpperCase();
				query = query+" where UPPER(companyName) like  '%"+companySearchText+"%'";
			}
		}
		else
		{
			companySearchText =companySearchText.toUpperCase();
			query = query + "where UPPER(companyName) like  '%"+companySearchText+"%'"+" and client_type_id ="+clientType;
		}
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		System.out.println(query);
		try {
			ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				ClientDTO dto = new ClientDTO();
				dto.setClientId(rs.getInt(1));
				dto.setCompanyName(rs.getString("companyName"));
				dto.setClient_type_id(rs.getInt("client_type_id"));
				al.add(dto);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return al;
	}
	
	public boolean insertUserMessage(AnnouncementDTO dto)
	{
		boolean flag = false;
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		int count = 0;
		
		try
		{
			ps = conn.prepareStatement("insert into messages(msgContent, userid) values(?,?)");
			ps.setString(1, dto.getMessage());
			ps.setInt(2, dto.getUserId());
			count = ps.executeUpdate();
			
			if(count>0)
				flag=true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			flag=false;
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return flag;
	}
	
	
	
	public ArrayList<AnnouncementDTO> getUserMessages(int userId)
	{
		ArrayList<AnnouncementDTO> al = new ArrayList<AnnouncementDTO>();
		String query = "select * from messages where userid=? order by date desc ";
		
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		System.out.println(query);
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				AnnouncementDTO dto = new AnnouncementDTO();
				dto.setUserId(rs.getInt("userid"));
				dto.setMsgId(rs.getInt("msgId"));
				dto.setMessage(rs.getString("msgContent"));
				dto.setDate(rs.getString("date"));
				al.add(dto);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return al;
	}
	
	
	public void addOpportunity(OpportunityDTO dto)
	{
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		int count = 0;
		
		try 
		{
			ps = conn.prepareStatement("insert into opportunities(opporName, addedBy, dateAdded, chanceToClose, estimatedBudget, opporDuration, opporType, contactName, contactTel, opporDesc, opporNotes, clientId) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, dto.getOpporName());
			ps.setString(2, dto.getAddedBy());
			ps.setString(3, dto.getAddedDate());
			ps.setString(4, dto.getChanceToClose());
			ps.setDouble(5, dto.getEstimatedBudget());
			ps.setString(6, dto.getOpporDuraration());
			ps.setString(7,dto.getOpporType());
			ps.setString(8, dto.getContactName());
			ps.setString(9, dto.getContactTel());
			ps.setString(10,dto.getOpporDesc());
			ps.setString(11,dto.getOpporNotes());
			ps.setInt(12, dto.getClientId());
			
			ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
	}
	public void addProposal(ProposalDTO dto)
	{
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		int count = 0;
		
		try 
		{
			ps = conn.prepareStatement("insert into proposals(proposalName, accountManager, dateAdded, chanceToClose, estimatedBudget, proposalDuration, proposalAmount, totalRevenue, proposalStatus, rejectionReason, contactName, contactTelephone, proposalDescription, proposalNotes, clientId) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, dto.getProposalName());
			ps.setString(2, dto.getAccountMgr());
			ps.setString(3, dto.getAddedDate());
			ps.setString(4, dto.getChanceToClose());
			ps.setDouble(5, dto.getEstimatedBudget());
			ps.setString(6,dto.getProposalDuration());
			ps.setDouble(7, dto.getProposalAmount());
			ps.setDouble(8, dto.getTotalRevenue());
			ps.setString(9,dto.getProposalStatus());
			ps.setString(10,dto.getRejectionReason());
			ps.setString(11, dto.getContactName());
			ps.setString(12, dto.getContactTel());
			ps.setString(13, dto.getProposalDesc());
			ps.setString(14,dto.getProposalNotes());
			ps.setInt(15,dto.getClientId());
			
			count = ps.executeUpdate();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
	}
	public void addProjects(Project dto)
	{
		PreparedStatement ps = null;
		Connection conn = ConnectionFactory.getConnection();
		int count = 0;
		
		try 
		{
			ps = conn.prepareStatement("insert into projects(projectName, projectManager, dateAdded, projectAmount, totalRevenue, projectDuration, projectStatus, launchDate, contactName, contactTelephone, projectDescription, projectNotes, clientId) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,dto.getProjectName());
			ps.setString(2,dto.getProjectMgr());
			ps.setString(3, dto.getAddedDate());
			ps.setDouble(4,dto.getProjectAmount());
			ps.setDouble(5, dto.getTotalRevenue());
			ps.setString(6, dto.getProjectDuration());
			ps.setString(7,dto.getProjectStatus());
			ps.setString(8, dto.getLaunchDate());
			ps.setString(9, dto.getContactName());
			ps.setString(10, dto.getContactTel());
			ps.setString(11, dto.getProjectDesc());
			ps.setString(12,dto.getProjectNotes());
			ps.setInt(13,dto.getClientId());
			count = ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try{
		         if(ps!=null)
		            ps.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
	}
}
