package com.qiaoxi.fragment;

import java.util.ArrayList;
import java.util.List;

import com.qiaoxi.bean.Dish;
import com.qiaoxi.shopkeeper.R;

import android.R.color;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class FragmentMenuContent extends Fragment {
	//����İ�ť
	private Spinner sp_dl;
	//С��İ�ť
	private Spinner sp_xl;
	//����������
	private SpinnerAdapter dlAdapter;
	//С��������
	private SpinnerAdapter xlAdapter;
	//������Դ����
	ArrayList<String> dlSource;
	//С����Դ����
	ArrayList<String> xlSource;
	//���ò�Ʒ��listview
	private ListView lv_setting; 
	//Ҫ���ص���ͼ
	private View v;
	//��Ʒ��Ϣ�ļ���
	private List<Dish> dishList;
	//���ò�Ʒ��listview��������
	private DishSettingAdapter dishListAdapter;
	//��ȡ������
	private LinearLayout ll_menu_content;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		v=inflater.inflate(R.layout.fragment_menu_content, container, false);
		return v;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		init(v);
	}
	/**
	 * ��ʼ������
	 */
	private void init(View v){
		//��ȡ����İ�ť
		sp_dl=(Spinner) v.findViewById(R.id.sp_dl);
		//��ȡС�ఴ��ť
		sp_xl=(Spinner) v.findViewById(R.id.sp_xl);
		//��ȡlistviewsetting
		lv_setting=(ListView) v.findViewById(R.id.lv_dishSetting);
		//��ȡ������
		ll_menu_content=(LinearLayout) v.findViewById(R.id.ll_menu_content);
		//��ʼ����Ʒ��Ϣ�ļ���
		dishList=new ArrayList<Dish>();
		//��ʼ������
		dlSource=new ArrayList<String>();
		xlSource=new ArrayList<String>();
		//�������
		dlSource.add("���");
		dlSource.add("�Ȳ�");
		dlSource.add("��");
		dlSource.add("����");
		xlSource.add("��ζ�ҳ���");
		xlSource.add("����������");
		xlSource.add("��԰ʱ��");
		xlSource.add("Ҥ���Ƽ�");
		dishList.add(new Dish(1001, "������", "dpr", "/images/01.jpg	", "��", 80, 60, 0, 0.8, "A��"));
		dishList.add(new Dish(1002, "�Ǵ��Ź�", "tcpg", "/images/01.jpg	", "��", 80, 60, 0, 0.8, "B��"));
		//��ʼ��������
		dlAdapter=new SpinnerAdapter(getActivity(), android.R.layout.simple_dropdown_item_1line, dlSource);
		xlAdapter=new SpinnerAdapter(getActivity(), android.R.layout.simple_dropdown_item_1line, xlSource);
		dishListAdapter=new DishSettingAdapter();
		//��ȡview��ͼ
		View add_footer=View.inflate(getActivity(), R.layout.listview_footer_adddish, null);
		//�����listview����
		lv_setting.addFooterView(add_footer);
		//��������
		sp_dl.setAdapter(dlAdapter);
		sp_xl.setAdapter(xlAdapter);
		lv_setting.setAdapter(dishListAdapter);
	}
	/**
	 * �Զ����spinner��������
	 * @author Administrator
	 *
	 */
	private class SpinnerAdapter extends ArrayAdapter<String>{
		
		private Context context;
		private List<String> items;
		public SpinnerAdapter(Context context, int resource, List<String> objects) {
			super(context, resource, objects);
			// TODO Auto-generated constructor stub
			this.context=context;
			this.items=objects;
		}
		@Override
		public View getDropDownView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			if(convertView==null){
				convertView=LayoutInflater.from(context).
				inflate(android.R.layout.simple_dropdown_item_1line, parent, false);
				
			}
			TextView tv=(TextView) convertView.findViewById(android.R.id.text1);
			tv.setText(items.get(position));
			tv.setGravity(Gravity.CENTER);
			tv.setTextColor(Color.BLACK);
			tv.setTextSize(16);
			return convertView;
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if(convertView==null){
				convertView=LayoutInflater.from(context).
				inflate(android.R.layout.simple_dropdown_item_1line, parent, false);
				
			}
			TextView tv=(TextView) convertView.findViewById(android.R.id.text1);
			tv.setText(items.get(position));
			tv.setGravity(Gravity.CENTER);
			tv.setTextColor(Color.BLACK);
			tv.setTextSize(16);
			return convertView;
		}
	}
	/**
	 * ��Ʒ���õ���������
	 * @author Administrator
	 *
	 */
	private class DishSettingAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return dishList.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder holder=null;
			if(convertView==null){
				holder=new ViewHolder();
				convertView=View.inflate(getActivity(), R.layout.dish_liseview_item, null);
				holder.sequenceNum=(TextView) convertView.findViewById(R.id.tv_bh);
				holder.dishId=(TextView) convertView.findViewById(R.id.tv_cpbh);
				holder.dishName=(TextView) convertView.findViewById(R.id.tv_cm);
				holder.imageUrl=(TextView) convertView.findViewById(R.id.tv_tplj);
				holder.unit=(TextView) convertView.findViewById(R.id.tv_dw);
				holder.serverFee=(TextView) convertView.findViewById(R.id.tv_fwf);
				holder.discount=(TextView) convertView.findViewById(R.id.tv_zkl);
				holder.printDepartment=(TextView) convertView.findViewById(R.id.tv_cdbm);
				holder.edit=(ImageView) convertView.findViewById(R.id.iv_bj);
				holder.delete=(ImageView) convertView.findViewById(R.id.iv_sc);
				holder.useable=(ImageView) convertView.findViewById(R.id.iv_ky);
				//���ñ�ǩ
				convertView.setTag(holder);
			}
			else{
				holder=(ViewHolder) convertView.getTag();
			}
			//��������
			holder.sequenceNum.setText(""+0);
			holder.dishId.setText(dishList.get(position).getDishId()+"");
			holder.dishName.setText(dishList.get(position).getDishName()+" "+dishList.get(position).getAbbrevation());
			holder.imageUrl.setText(dishList.get(position).getImageUrl());
			holder.unit.setText(dishList.get(position).getPrice()+"/"+dishList.get(position).getClientPrice()+"("+dishList.get(position).getUnit()+")");
			holder.serverFee.setText(dishList.get(position).getServerPrice()+"");
			holder.discount.setText(dishList.get(position).getDiscount()+"");
			holder.printDepartment.setText(dishList.get(position).getPrintDepartment());
			holder.edit.setImageResource(R.drawable.note_on);
			holder.delete.setImageResource(R.drawable.del_on2);
			holder.useable.setImageResource(R.drawable.choice_on);
			return convertView;
		}
		private class ViewHolder{
			private TextView sequenceNum;
			private TextView dishId;
			private TextView dishName;
			private TextView imageUrl;
			private TextView unit;
			private TextView serverFee;
			private TextView discount;
			private TextView printDepartment;
			private ImageView edit;
			private ImageView delete;
			private ImageView  useable;
		}
	}
}
